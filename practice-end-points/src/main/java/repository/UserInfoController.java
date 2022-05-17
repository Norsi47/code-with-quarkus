package repository;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Path("/usersInfo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserInfoController {

    @POST
    @Path("/createUsers")
    @Transactional
    public Response createUsersInfo(UserInfoEntity userInfoEntity) {
        UserInfoEntity.persist(userInfoEntity);
        if (userInfoEntity.isPersistent()) {
            return Response.created(URI.create("/usersInfo" + userInfoEntity.id)).build();
        }
        return Response.status(Response.Status.BAD_REQUEST).build();
    }

    @GET
    @Path("/getAllUsers")
    public Response getUsersInfo() {
        //this is in an array list to let it continue to create more info
        List<UserInfoEntity> userInfoEntityList = UserInfoEntity.listAll();
        return Response.ok(userInfoEntityList).build();
    }

}
