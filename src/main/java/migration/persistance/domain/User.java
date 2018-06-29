package migration.persistance.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;


@Entity
@Document(collection = "users")
public class User implements Serializable {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String bio;
    private List<String> cloudMessagingTokens;
    private Integer followingCount;
    private Integer followersCount;
    private Integer postCount;
    private GameScore gameScores;
    private Address address;
    private String privacyStatus;
    private Integer resetPasswordAttempts;
    private Boolean onboarded;
    private Boolean active;
    private Integer __v;
    private Location location;
    private String profileCoverImage;
    private String profileImage;
    private String userType;
    @Transient
    private UserRssFeed rssFeed;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<String> getCloudMessagingTokens() {
        return cloudMessagingTokens;
    }

    public void setCloudMessagingTokens(List<String> cloudMessagingTokens) {
        this.cloudMessagingTokens = cloudMessagingTokens;
    }

    public Integer getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(Integer followingCount) {
        this.followingCount = followingCount;
    }

    public Integer getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    public Integer getPostCount() {
        return postCount;
    }

    public void setPostCount(Integer postCount) {
        this.postCount = postCount;
    }

    public GameScore getGameScores() {
        return gameScores;
    }

    public void setGameScores(GameScore gameScores) {
        this.gameScores = gameScores;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPrivacyStatus() {
        return privacyStatus;
    }

    public void setPrivacyStatus(String privacyStatus) {
        this.privacyStatus = privacyStatus;
    }

    public Integer getResetPasswordAttempts() {
        return resetPasswordAttempts;
    }

    public void setResetPasswordAttempts(Integer resetPasswordAttempts) {
        this.resetPasswordAttempts = resetPasswordAttempts;
    }

    public Boolean getOnboarded() {
        return onboarded;
    }

    public void setOnboarded(Boolean onboarded) {
        this.onboarded = onboarded;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer get__v() {
        return __v;
    }

    public void set__v(Integer __v) {
        this.__v = __v;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getProfileCoverImage() {
        return profileCoverImage;
    }

    public void setProfileCoverImage(String profileCoverImage) {
        this.profileCoverImage = profileCoverImage;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public UserRssFeed getRssFeed() {
        return rssFeed;
    }

    public void setRssFeed(UserRssFeed rssFeed) {
        this.rssFeed = rssFeed;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", bio='" + bio + '\'' +
                ", cloudMessagingTokens=" + cloudMessagingTokens +
                ", followingCount=" + followingCount +
                ", followersCount=" + followersCount +
                ", postCount=" + postCount +
                ", gameScores=" + gameScores +
                ", address=" + address +
                ", privacyStatus='" + privacyStatus + '\'' +
                ", resetPasswordAttempts=" + resetPasswordAttempts +
                ", onboarded=" + onboarded +
                ", active=" + active +
                ", __v=" + __v +
                ", location=" + location +
                ", profileCoverImage='" + profileCoverImage + '\'' +
                ", profileImage='" + profileImage + '\'' +
                ", userType='" + userType + '\'' +
                ", rssFeed=" + rssFeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getId() != null ? !getId().equals(user.getId()) : user.getId() != null) return false;
        if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) : user.getFirstName() != null)
            return false;
        if (getLastName() != null ? !getLastName().equals(user.getLastName()) : user.getLastName() != null)
            return false;
        if (getEmail() != null ? !getEmail().equals(user.getEmail()) : user.getEmail() != null) return false;
        if (getPassword() != null ? !getPassword().equals(user.getPassword()) : user.getPassword() != null)
            return false;
        if (getBio() != null ? !getBio().equals(user.getBio()) : user.getBio() != null) return false;
        if (getCloudMessagingTokens() != null ? !getCloudMessagingTokens().equals(user.getCloudMessagingTokens()) : user.getCloudMessagingTokens() != null)
            return false;
        if (getFollowingCount() != null ? !getFollowingCount().equals(user.getFollowingCount()) : user.getFollowingCount() != null)
            return false;
        if (getFollowersCount() != null ? !getFollowersCount().equals(user.getFollowersCount()) : user.getFollowersCount() != null)
            return false;
        if (getPostCount() != null ? !getPostCount().equals(user.getPostCount()) : user.getPostCount() != null)
            return false;
        if (getGameScores() != null ? !getGameScores().equals(user.getGameScores()) : user.getGameScores() != null)
            return false;
        if (getAddress() != null ? !getAddress().equals(user.getAddress()) : user.getAddress() != null) return false;
        if (getPrivacyStatus() != null ? !getPrivacyStatus().equals(user.getPrivacyStatus()) : user.getPrivacyStatus() != null)
            return false;
        if (getResetPasswordAttempts() != null ? !getResetPasswordAttempts().equals(user.getResetPasswordAttempts()) : user.getResetPasswordAttempts() != null)
            return false;
        if (getOnboarded() != null ? !getOnboarded().equals(user.getOnboarded()) : user.getOnboarded() != null)
            return false;
        if (getActive() != null ? !getActive().equals(user.getActive()) : user.getActive() != null) return false;
        if (get__v() != null ? !get__v().equals(user.get__v()) : user.get__v() != null) return false;
        if (getLocation() != null ? !getLocation().equals(user.getLocation()) : user.getLocation() != null)
            return false;
        if (getProfileCoverImage() != null ? !getProfileCoverImage().equals(user.getProfileCoverImage()) : user.getProfileCoverImage() != null)
            return false;
        if (getProfileImage() != null ? !getProfileImage().equals(user.getProfileImage()) : user.getProfileImage() != null)
            return false;
        if (getUserType() != null ? !getUserType().equals(user.getUserType()) : user.getUserType() != null)
            return false;
        return !(getRssFeed() != null ? !getRssFeed().equals(user.getRssFeed()) : user.getRssFeed() != null);

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        result = 31 * result + (getBio() != null ? getBio().hashCode() : 0);
        result = 31 * result + (getCloudMessagingTokens() != null ? getCloudMessagingTokens().hashCode() : 0);
        result = 31 * result + (getFollowingCount() != null ? getFollowingCount().hashCode() : 0);
        result = 31 * result + (getFollowersCount() != null ? getFollowersCount().hashCode() : 0);
        result = 31 * result + (getPostCount() != null ? getPostCount().hashCode() : 0);
        result = 31 * result + (getGameScores() != null ? getGameScores().hashCode() : 0);
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + (getPrivacyStatus() != null ? getPrivacyStatus().hashCode() : 0);
        result = 31 * result + (getResetPasswordAttempts() != null ? getResetPasswordAttempts().hashCode() : 0);
        result = 31 * result + (getOnboarded() != null ? getOnboarded().hashCode() : 0);
        result = 31 * result + (getActive() != null ? getActive().hashCode() : 0);
        result = 31 * result + (get__v() != null ? get__v().hashCode() : 0);
        result = 31 * result + (getLocation() != null ? getLocation().hashCode() : 0);
        result = 31 * result + (getProfileCoverImage() != null ? getProfileCoverImage().hashCode() : 0);
        result = 31 * result + (getProfileImage() != null ? getProfileImage().hashCode() : 0);
        result = 31 * result + (getUserType() != null ? getUserType().hashCode() : 0);
        result = 31 * result + (getRssFeed() != null ? getRssFeed().hashCode() : 0);
        return result;
    }
}