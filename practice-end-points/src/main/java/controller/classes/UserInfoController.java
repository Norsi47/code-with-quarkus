package controller.classes;

import put.requests.UserInfoRequest;
import put.response.UserInfoResponse;
import service.classes.UserInfoService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


@Path("/usersInfo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserInfoController {


//    UserInfoService userInfoService = new UserInfoService();


//    @POST
//    @Path("/showUserInfo")
//    public Response showUserInfo(UserInfoRequest request) {
//
//
//        userInfoService.showUserInfo(request);
//        return Response.ok(userInfoService).build();
//
//    }

    List <UserInfoResponse> userInfoResponseArrayList = new ArrayList<>();

    @POST
    @Path("/testUserInfo")
    public Response tesinResponse(UserInfoRequest request) {
        UserInfoResponse userInfoResponse = new UserInfoResponse();
        userInfoResponse.setUserAge(45);
        userInfoResponseArrayList.add(userInfoResponse);
        return Response.ok().build();

    }

}
