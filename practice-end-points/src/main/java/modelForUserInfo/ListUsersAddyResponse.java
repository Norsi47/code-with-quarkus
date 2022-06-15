package modelForUserInfo;

import lombok.Data;

@Data
public class ListUsersAddyResponse {

    private String streetUser;
    //this is city_user on users_address database
    private String city;
    private String state;
    private int zipcode;
}
