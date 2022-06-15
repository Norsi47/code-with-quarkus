package userInfoController_Service;

import modelForUserInfo.ListUsersInfoRequest;
import modelForUserInfo.UsersRequest;
import modelForUserInfo.UsersResponse;

import java.util.ArrayList;
import java.util.List;

public class UsersService {



    public UsersResponse createUsersInfo(UsersRequest usersRequest) {
        UsersResponse usersResponse = new UsersResponse();

        //not needed since we are getting from userRequest class
        //but will need to format insomnia to match array list
//        ListUsersInfoRequest listUsersInfoRequest = new ListUsersInfoRequest();

        // this way is a longer and option
//        usersResponse.setFirstName(usersRequest);
//        usersResponse.setLastName(listUsersInfoRequest.getLastName());
//        usersResponse.setUsersAge(listUsersInfoRequest.getUsersAge());
//        usersResponse.setStreetUser(usersRequest.getListUsersInfoRequest(usersRequest.));
//        usersResponse.setCity(usersRequest.getCity());

        //not too sure why not working
        usersResponse.setListUsersInfoResponses(usersRequest.getListUsersInfoRequest());
        usersRequest.setListUsersAddyRequests(usersRequest.getListUsersAddyRequests());
        usersResponse.setListUsersAddyResponses(usersRequest.getListUsersAddyRequests());




        return usersResponse;
    }

}
