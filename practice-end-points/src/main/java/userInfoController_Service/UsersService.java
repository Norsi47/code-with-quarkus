package userInfoController_Service;

import entities.UsersInfoEnity;
import lombok.extern.slf4j.Slf4j;
import modelForUserInfo.UsersRequest;
import modelForUserInfo.UsersResponse;
import repositoryUserInfo.UserInfoRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
@Slf4j
public class UsersService {

    @Inject
    UserInfoRepository userInfoRepository;


    public UsersResponse createUsersInfo(UsersRequest usersRequest) {
        UsersResponse usersResponse = new UsersResponse();

        //not needed since we are getting from userRequest class
        //but will need to format insomnia to match array list
//        ListUsersInfoRequest listUsersInfoRequest = new ListUsersInfoRequest();

        // this way is a longer and option
        usersResponse.setFirstName(usersRequest.getFirstName());
        usersResponse.setLastName(usersRequest.getLastName());
        usersResponse.setUsersAge(usersRequest.getUsersAge());
        usersResponse.setStreetUser(usersRequest.getStreetUser());
        usersResponse.setCity(usersRequest.getCity());

        //not too sure why not working
//        usersResponse.setListUsersInfoResponses(usersRequest.getListUsersInfoRequest());
//        usersRequest.setListUsersAddyRequests(usersRequest.getListUsersAddyRequests());
//        usersResponse.setListUsersAddyResponses(usersRequest.getListUsersAddyRequests());

        return usersResponse;
    }

    //making this method to save into db table
    //db save
    @Transactional
    boolean saveRequestToDB(UsersRequest usersRequest) {

        UsersInfoEnity usersInfoEnity = new UsersInfoEnity();

//        usersInfoEnity.setFirstName(usersRequest.getFirstName)
//                .set;

        usersInfoEnity.setFirstName(usersRequest.getFirstName());
        usersInfoEnity.setLastName(usersRequest.getLastName());

        usersInfoEnity = userInfoRepository.save(usersInfoEnity);

        return true;
    }

}
