package put.response;

import entities.UsersAddress;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.control.ActivateRequestContext;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
@Slf4j
@ActivateRequestContext
@AllArgsConstructor
public class UserAddressRepository {

    @Inject
    EntityManager entityManager;

    public UsersAddress save (UsersAddress usersAddress) {
        try {
            return entityManager.merge(usersAddress);
        }
        catch (Exception e) {
            log.error("Unable to save");
        }
        return null;

    }

}
