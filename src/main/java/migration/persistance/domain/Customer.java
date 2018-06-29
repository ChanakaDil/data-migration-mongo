package migration.persistance.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;


public class Customer {

    @Id
    public String id;

    public String firstName;
    public String lastName;

    @OneToMany(mappedBy = "customer", cascade = javax.persistence.CascadeType.ALL)
    public Set<Address> addressList = new HashSet<>();

    public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public Set<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(Set<Address> addressList) {
        this.addressList = addressList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", addressList=" + addressList +
                '}';
    }
}

