package service.classes;


import org.onye.model.UsersNames;
import put.requests.UserInfoRequest;
import put.response.UserInfoResponse;

import java.util.ArrayList;
import java.util.List;

public class UserInfoService {


    UserInfoResponse userInfoResponse = new UserInfoResponse();
    UserInfoRequest userInfoRequest = new UserInfoRequest();

    public UserInfoResponse showUserInfo(UserInfoRequest userInfoRequest) {
        userInfoResponse.setUserNames(userInfoRequest.getUsersNames());
        userInfoResponse.setUserAddressInfo(userInfoRequest.getAddressInfo());
        userInfoResponse.setUserAge(userInfoRequest.getUsersAge());
        return userInfoResponse;
    }


    public UserInfoResponse  testUserInfoResponse(UserInfoRequest userInfoRequest) {
        userInfoResponse.setUserAge(userInfoRequest.getUsersAge());
        return userInfoResponse;

    }

    public UserInfoResponse userInfoResponseList(int userAge) {


        List<UserInfoResponse> userInfoResponseList = new ArrayList<>();
        userInfoResponse.getUserAge();
        return userInfoResponse;
    }

}
