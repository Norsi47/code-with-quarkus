package org.acme.PanacheRepositoty;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/exMovies")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class MovieController {

    @Inject
    MovieRepository movieRepository;

    @GET
    public Response getAllMovies() {
        List<MovieServiceEntity> movieServiceEntities = movieRepository.listAll();
        return Response.ok(movieServiceEntities).build();
    }


}
