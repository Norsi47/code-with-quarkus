package service.classes;

import Requests.UserInfoRequest;
import Response.UserInfoResponse;

public class UserInfoService {

//    UserInfoRequest userInfoRequest = new UserInfoRequest();
    UserInfoResponse userInfoResponse = new UserInfoResponse();

    public UserInfoResponse showUserInfo(UserInfoRequest userInfoRequest) {
        userInfoResponse.setUserNames(userInfoRequest.getUsersNames());
        userInfoResponse.setUserAddressInfo(userInfoRequest.getAddressInfo());
        userInfoResponse.setUserAge(userInfoRequest.getUsersAge());
        return userInfoResponse;
    }

}
