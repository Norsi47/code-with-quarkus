package modelForUserInfo;

import lombok.Data;

import java.util.List;

@Data
public class UsersResponse {

    //turn to list to match UsersNames Class
// need to look into this more
//    private List<ListUsersInfoResponse> listUsersInfoResponses;
//    private List<ListUsersAddyResponse> listUsersAddyResponses;

    private String firstName;

    private String lastName;

    private int usersAge;

    private String streetUser;
    //this is city_user on users_address database
    private String city;
    private String state;
    private int zipcode;

    private String statusInfo;


}
