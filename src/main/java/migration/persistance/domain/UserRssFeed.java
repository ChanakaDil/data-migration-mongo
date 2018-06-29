package migration.persistance.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Document(collection = "user-rss-feeds")
public class UserRssFeed implements Serializable {

    @Id
    private String id;

    private String userId;

    private Set<Feed> feeds = new HashSet<>();

    private Sync sync;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<Feed> getFeeds() {
        return feeds;
    }

    public void setFeeds(Set<Feed> feeds) {
        this.feeds = feeds;
    }

    public Sync getSync() {
        return sync;
    }

    public void setSync(Sync sync) {
        this.sync = sync;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserRssFeed{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", feeds=" + feeds +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserRssFeed)) return false;

        UserRssFeed that = (UserRssFeed) o;

        if (getUserId() != null ? !getUserId().equals(that.getUserId()) : that.getUserId() != null) return false;
        return !(getFeeds() != null ? !getFeeds().equals(that.getFeeds()) : that.getFeeds() != null);

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getUserId() != null ? getUserId().hashCode() : 0);
        result = 31 * result + (getFeeds() != null ? getFeeds().hashCode() : 0);
        result = 31 * result + (getSync() != null ? getSync().hashCode() : 0);
        return result;
    }
}