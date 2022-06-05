package repositoryUserInfo;

import entities.UsersInfo;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.control.ActivateRequestContext;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

//this class is needed to save info in database
@ApplicationScoped
@Transactional
@Slf4j
@ActivateRequestContext
@AllArgsConstructor
public class UserInfoRepository implements PanacheRepository<UsersInfo> {

    @Inject
    EntityManager entityManager;

    public UsersInfo save(UsersInfo usersInfo) {
        try {
            return entityManager.merge(usersInfo);
        } catch (Exception exception) {
            log.error("Unable to save");
        }
        return null;

    }


}
