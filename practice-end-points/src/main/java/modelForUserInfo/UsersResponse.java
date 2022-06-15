package modelForUserInfo;

import lombok.Data;

import java.util.List;

@Data
public class UsersResponse {

    //turn to list to match UsersNames Class

    private List<ListUsersInfoResponse> listUsersInfoResponses;
    private List<ListUsersAddyResponse> listUsersAddyResponses;



}
