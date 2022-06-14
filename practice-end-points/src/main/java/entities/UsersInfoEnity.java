package entities;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Entity
@Table(name = "users_info", schema = "public", catalog = "testUsersInfo")
@Data
@Slf4j
public class UsersInfoEnity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "users_id", nullable = false)
    private long usersId;
    @Basic
    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;
    @Basic
    @Column(name = "users_age", nullable = false, length = 100)
    private String usersAge;
    @Basic
    @Column(name = "users_addy_id", nullable = true)
    private Integer usersAddyId;

////    maybe use when foreign key is added?
//    @JoinColumn(name = "users_addy_id", referencedColumnName = "users_addy_id", insertable = false, updatable = false)
//    @OneToMany(fetch = FetchType.EAGER)
//    private List<UsersAddress> usersAddresses;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersInfoEnity usersInfoEnity = (UsersInfoEnity) o;

        if (usersId != usersInfoEnity.usersId) return false;
        if (firstName != null ? !firstName.equals(usersInfoEnity.firstName) : usersInfoEnity.firstName != null) return false;
        if (lastName != null ? !lastName.equals(usersInfoEnity.lastName) : usersInfoEnity.lastName != null) return false;
        if (usersAge != null ? !usersAge.equals(usersInfoEnity.usersAge) : usersInfoEnity.usersAge != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (usersId ^ (usersId >>> 32));
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (usersAge != null ? usersAge.hashCode() : 0);
        return result;
    }

}
