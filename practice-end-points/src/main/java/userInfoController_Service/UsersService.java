package userInfoController_Service;

import modelForUserInfo.UsersRequest;
import modelForUserInfo.UsersResponse;

public class UsersService {

    public UsersResponse createUsersInfo(UsersRequest usersRequest) {
        UsersResponse usersResponse = new UsersResponse();
        usersResponse.setFirstName(usersRequest.getFirstName());
        usersResponse.setLastName(usersRequest.getLastName());
        usersResponse.setUsersAge(usersRequest.getUsersAge());
        usersResponse.setStreetUser(usersRequest.getStreetUser());
        usersResponse.setCity(usersRequest.getCity());
        usersResponse.setState(usersRequest.getState());
        usersResponse.setZipcode(usersRequest.getZipcode());


        return usersResponse;
    }

}
