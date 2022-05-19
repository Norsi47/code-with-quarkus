package repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class UserInfoPanache implements PanacheRepository<UserInfoRepo> {

    public List<UserInfoRepo> findByUsersName(String usersName) {
        return list("SELECT u FROM UserInfoRepo u WHERE u.usersName = ?1 ORDER BY usersName " +
                "DESC" , usersName);
    }

}
