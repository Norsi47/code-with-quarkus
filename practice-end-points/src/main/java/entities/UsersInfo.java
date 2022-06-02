package entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users_info", schema = "public", catalog = "testUsersInfo")
@Data
public class UsersInfo {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersInfo usersInfo = (UsersInfo) o;

        if (usersId != usersInfo.usersId) return false;
        if (firstName != null ? !firstName.equals(usersInfo.firstName) : usersInfo.firstName != null) return false;
        if (lastName != null ? !lastName.equals(usersInfo.lastName) : usersInfo.lastName != null) return false;
        if (usersAge != null ? !usersAge.equals(usersInfo.usersAge) : usersInfo.usersAge != null) return false;

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
