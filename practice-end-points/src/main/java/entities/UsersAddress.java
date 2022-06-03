package entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users_address", schema = "public", catalog = "testUsersInfo")
@Data
public class UsersAddress {
    @Basic
    @Column(name = "street_user", nullable = true, length = 100)
    private String streetUser;
    @Basic
    @Column(name = "city_user", nullable = true, length = 100)
    private String cityUser;
    @Basic
    @Column(name = "state_user", nullable = true, length = 100)
    private String stateUser;
    @Basic
    @Column(name = "zipcode_user", nullable = true)
    private Integer zipcodeUser;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "address_id", nullable = false)
    private int addressId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersAddress that = (UsersAddress) o;

        if (addressId != that.addressId) return false;
        if (streetUser != null ? !streetUser.equals(that.streetUser) : that.streetUser != null) return false;
        if (cityUser != null ? !cityUser.equals(that.cityUser) : that.cityUser != null) return false;
        if (stateUser != null ? !stateUser.equals(that.stateUser) : that.stateUser != null) return false;
        if (zipcodeUser != null ? !zipcodeUser.equals(that.zipcodeUser) : that.zipcodeUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = streetUser != null ? streetUser.hashCode() : 0;
        result = 31 * result + (cityUser != null ? cityUser.hashCode() : 0);
        result = 31 * result + (stateUser != null ? stateUser.hashCode() : 0);
        result = 31 * result + (zipcodeUser != null ? zipcodeUser.hashCode() : 0);
        result = 31 * result + addressId;
        return result;
    }
}
