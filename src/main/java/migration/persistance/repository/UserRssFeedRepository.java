package migration.persistance.repository;

import migration.persistance.domain.UserRssFeed;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRssFeedRepository extends MongoRepository<UserRssFeed, String> {
    UserRssFeed findByUserId(String userId);
}