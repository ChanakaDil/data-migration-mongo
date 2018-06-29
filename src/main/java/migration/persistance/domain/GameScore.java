package migration.persistance.domain;

import java.io.Serializable;

public class GameScore implements Serializable {

    private Integer points;

    private Integer level;

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "GameScore{" +
                "points=" + points +
                ", level=" + level +
                '}';
    }
}