package service.classes;


import put.requests.UserInfoRequest;
import put.response.UserInfoResponse;

public class UserInfoService {


    UserInfoResponse userInfoResponse = new UserInfoResponse();

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
}
