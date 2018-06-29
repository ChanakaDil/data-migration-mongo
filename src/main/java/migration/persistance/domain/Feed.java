package migration.persistance.domain;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class Feed implements Serializable{

    @Id
    private String id;
    private String url;
    private String source;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Feed{" +
                "url='" + url + '\'' +
                ", source='" + source + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Feed)) return false;

        Feed feed = (Feed) o;

        return getUrl().equals(feed.getUrl());

    }

    @Override
    public int hashCode() {
        return getUrl().hashCode();
    }
}