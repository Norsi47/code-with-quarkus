package controller.classes;

import Requests.UserInfoRequest;
import service.classes.UserInfoService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/usersInfo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserInfoController {

    UserInfoService userInfoService;


    @POST
    @Path("/showUserInfo")
    public Response showUserInfo(UserInfoRequest request) {
        userInfoService.showUserInfo(request);
        return Response.ok(userInfoService).build();

    }

}
