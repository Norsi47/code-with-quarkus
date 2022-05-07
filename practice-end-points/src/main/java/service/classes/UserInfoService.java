package service.classes;


import put.requests.UserInfoRequest;
import put.response.UserInfoResponse;

import java.util.ArrayList;
import java.util.List;

public class UserInfoService {


    UserInfoResponse userInfoResponse = new UserInfoResponse();
    UserInfoRequest userInfoRequest = new UserInfoRequest();

    List<UserInfoRequest> userInfoRequestList = new ArrayList<>();

    public UserInfoResponse showUserInfo(UserInfoRequest userInfoRequest) {
        userInfoResponse.setUserNames(userInfoRequest.getUsersNames());
        userInfoResponse.setUserAddressInfo(userInfoRequest.getAddressInfo());
        userInfoResponse.setUserAge(userInfoRequest.getUsersAge());
        //saves the request into the empty list
        userInfoRequestList.add(userInfoRequest);
        return userInfoResponse;
    }


    public UserInfoResponse  testUserInfoResponse(UserInfoRequest userInfoRequest) {
        userInfoResponse.setUserAge(userInfoRequest.getUsersAge());

        return userInfoResponse;

    }

    //returns the array list
    public List<UserInfoRequest> saveUserInfo() {

         return userInfoRequestList;

    }

    //needs more work
    public int findByUserAge(int userAge) {
        userInfoRequestList.get(userAge);
        return userAge;

    }

}
