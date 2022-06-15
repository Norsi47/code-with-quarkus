package modelForUserInfo;

import lombok.Data;

import java.util.List;

@Data
public class UsersRequest {

//in the future maybe use the entity to look up records saved in database

//needs to be in an array list to print out
   List <ListUsersInfoRequest> listUsersInfoRequest;
  private  List<ListUsersAddyRequest> listUsersAddyRequests;



}
