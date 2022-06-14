package userInfoController_Service;

import modelForUserInfo.UsersRequest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsersController {

    @POST
    @Path("/saveUsersInfo")
    public Response saveUsersInfo(UsersRequest usersRequest) {

        UsersService usersService = new UsersService();

        return Response.ok(usersService.createUsersInfo(usersRequest)).build();
    }


}
