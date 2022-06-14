package modelForUserInfo;

import lombok.Data;

@Data
public class UsersRequest {

    //turn to list to match UserNames Class
    //will make code look neater

    private String firstName;
    private String lastName;
    private int usersAge;
    private String streetUser;
    //this is city_user on users_address database
    private String city;
    private String state;
    private int zipcode;




}
