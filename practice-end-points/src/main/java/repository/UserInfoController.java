package repository;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Path("/usersInfo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserInfoController {

    @Inject
    UserInfoPanache userInfoPanache;

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
    //works now
    @GET
    @Path("/getByUsersName/{usersName}")
    public Response getByUsersName(@PathParam("usersName") String usersName) {
        //spacing of sql matters, works now
        List<UserInfoEntity> userInfoEntityList = UserInfoEntity.list("SELECT u FROM " +
                "UserInfoEntity u WHERE u.usersName = ?1 ORDER BY id " +
                "DESC" , usersName);
        return Response.ok(userInfoEntityList).build();
    }

    @GET
    @Path("/tesUserInfo/{testUser}")
    public Response testUser(@PathParam("testUser") String testUsersName) {
        return UserInfoEntity.find("usersName", testUsersName)
                .singleResultOptional()
                .map(testingUser -> Response.ok(testingUser).build())
                .orElse(Response.status(Response.Status.NOT_FOUND).build());

    }
//add response class to show response in insomnia

    //does not work, not too sure why
    @GET
    @Path("/userName/{usersName}")
    public Response findByUsersName(@PathParam("usersName") String userName) {
        List<UserInfoRepo> userInfoEntityList = userInfoPanache.findByUsersName(userName);
        return Response.ok(userInfoEntityList).build();
    }

    //find by ID
    @GET
    @Path("/getById/{id}")
    public Response getById(@PathParam("id") Long id) {
        return UserInfoEntity.findByIdOptional(id)
                .map(users -> Response.ok(users).build())
                .orElse(Response.status(Response.Status.NOT_FOUND).build());

    }
    //random stuff
    //random stuff again

}
