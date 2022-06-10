package modelForUserInfo;

import lombok.Data;

@Data
public class UsersResponse {

    //we want it to match request
    private String firstName;
    private String lastName;
    private int usersAge;
    private String streetUser;
    //this is city_user on users_address database
    private String city;
    private String state;
    private int zipcode;


}
