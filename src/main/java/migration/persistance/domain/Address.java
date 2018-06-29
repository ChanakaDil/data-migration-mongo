package migration.persistance.domain;

import java.io.Serializable;

public class Address implements Serializable{

    private String locationName;

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "locationName='" + locationName + '\'' +
                '}';
    }
}

