package service.classes;


import put.requests.UserInfoRequest;
import put.response.UserInfoResponse;

import java.util.ArrayList;
import java.util.List;

public class UserInfoService {


    UserInfoResponse userInfoResponse = new UserInfoResponse();
    UserInfoRequest userInfoRequest = new UserInfoRequest();

    List<UserInfoRequest> userInfoRequestList = new ArrayList<>();
    List<UserInfoRequest> userInfoResponseList = new ArrayList<UserInfoRequest>();

    public UserInfoResponse showUserInfo(UserInfoRequest userInfoRequest) {
        userInfoResponse.setUserNames(userInfoRequest.getUsersNames());
        userInfoResponse.setUserAddressInfo(userInfoRequest.getAddressInfo());
        userInfoResponse.setUsersAge(userInfoRequest.getUsersAge());
        //saves the request into the empty array list
        userInfoRequestList.add(userInfoRequest);

        //save response in list
//        userInfoResponseList.add(userInfoResponse);

        return userInfoResponse;
    }


    public UserInfoResponse  testUserInfoResponse(UserInfoRequest userInfoRequest) {
        userInfoResponse.setUsersAge(userInfoRequest.getUsersAge());

        return userInfoResponse;

    }

    //returns the array list
    public List<UserInfoRequest> saveUserInfo() {

         return userInfoRequestList;

    }

//    public UserInfoRequest  saveUserResponse(int usersAge) {
////        usersAge = userInfoRequest.getUsersAge();
//        userInfoRequest.setUsersAge(usersAge);
//
////        userInfoResponse.getUsersAge();
//
//        return userInfoRequest;
//
//    }

    //needs more work
    public UserInfoRequest findByUserAge(int usersAge) {
        UserInfoRequest userInfoResponse = userInfoRequestList.get(usersAge);
        userInfoResponseList.add(userInfoResponse);
        return userInfoRequest;


    }

}
