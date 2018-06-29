package migration;

import migration.persistance.Reader;
import migration.persistance.domain.User;
import migration.persistance.domain.UserRssFeed;
import migration.persistance.repository.UserRepository;
import migration.persistance.repository.UserRssFeedRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(Application.class);

	@Value("${s3-image-url}")
	private String commonImageUrl;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserRssFeedRepository userRssFeedRepository;

	@Autowired
	private Reader reader;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		List<User> users = userRepository.findAll();
		LOG.info("########################## User List Size : {} ##########################" + users.size());
		List<String> idList = reader.getUserIds("user-ids");
		LOG.info("########################## User Id List Size : {} ##########################" + idList.size());
		List<UserRssFeed> userRssFeeds = userRssFeedRepository.findAll();
		LOG.info("########################## User Feed List Size : {} ##########################" + userRssFeeds.size());
		for(User user : users) {
			UserRssFeed userRssFeed =userRssFeeds.stream().filter(userRssFeed1 -> userRssFeed1.getUserId().equals(user.getId())).findFirst().get();
			user.setRssFeed(userRssFeed);
		}

		List<User> relevantUserList = users.stream().filter(u -> idList.contains(u.getId())).collect(Collectors.toList());
		List<UserRssFeed> relevantRssFeeds = new ArrayList<>();
		LOG.info("########################## Filtered {} Users ########################## ", relevantUserList.size());


		if(users.size() != relevantUserList.size()) {
			relevantUserList.forEach(user -> {
				user.setLastName("");
				user.setProfileImage(commonImageUrl + user.getId() + ".png");
				List<User> childUsers = users.stream().filter(subUser -> subUser.getFirstName().equals(user.getFirstName()) && !idList.contains(subUser.getId())).collect(Collectors.toList());
				LOG.info("Child Users Size for User : {} is {} ", user.getFirstName(), childUsers.size());
				UserRssFeed userRssFeed = user.getRssFeed();
				childUsers.forEach(chUser -> userRssFeed.getFeeds().addAll(chUser.getRssFeed().getFeeds()));
				relevantRssFeeds.add(userRssFeed);
			});
			LOG.info("Final User List Size : {} ", relevantUserList.size());
			LOG.info("Final RSS Feed List Size : {} ", relevantRssFeeds.size());
			for(int i=0 ; i< relevantUserList.size(); i++) {
				LOG.info("User : {} ", relevantUserList.get(i));
				LOG.info("User RSS Feed : {} ", relevantRssFeeds.get(i));
			}

			userRepository.deleteAll();
			userRssFeedRepository.deleteAll();

			userRepository.saveAll(relevantUserList);
			userRssFeedRepository.saveAll(relevantRssFeeds);

			LOG.info("########################## Finished Saving New Records : {} ##########################", relevantRssFeeds.size());
		} else {
			LOG.info("########################## Already Updated! No need of processing ! ##########################");
		}

	}


}
