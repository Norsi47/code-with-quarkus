package controller.classes;

import put.requests.UserInfoRequest;
import put.response.UserInfoResponse;
import service.classes.UserInfoService;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


@Path("/usersInfo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserInfoController {


    UserInfoService userInfoService = new UserInfoService();
    UserInfoRequest userInfoRequest = new UserInfoRequest();

    List<UserInfoRequest> userInfoRequestList = new ArrayList<>();



    @POST
    @Path("/showUserInfo")
    public Response showUserInfo(UserInfoRequest request) {


        return Response.ok(userInfoService.showUserInfo(request)).build();

    }


    @POST
    @Path("/testUserInfo")
    public Response testingResponse(UserInfoRequest request) {
//        UserInfoResponse userInfoResponse = new UserInfoResponse();
//        userInfoResponse.setUserAge(request.getUsersAge());
        //only need to put in array list if calls will be done multi times
////        userInfoResponseArrayList.add(userInfoResponse);
//        return Response.ok(userInfoResponseArrayList).build();
        //another way to do it
        return Response.ok(userInfoService.testUserInfoResponse(request)).build();

    }

    List<UserInfoResponse> userInfoResponseList = new ArrayList<>();
    @GET
    @Path("/getUserInfo/{usersAge}")
    public Response saveUserInfo(@PathParam("userAge") int usersAge) {



        return Response.ok(userInfoService.findByUserAge(usersAge)).build();

    }

    @GET
    @Path("/requestUserInfo")
    public Response showUsersInfo() {
//        userInfoRequestList.add(userInfoRequest);
        return Response.ok(userInfoService.saveUserInfo()).build();
    }

}

