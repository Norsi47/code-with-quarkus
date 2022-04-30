package org.acme.PanacheRepositoty;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

import static javax.ws.rs.core.Response.Status.BAD_REQUEST;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;

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

    @GET
    @Path("/movieById/{id}")
    public Response getById(@PathParam("id") Long id) {
       return movieRepository.findByIdOptional(id)
                .map(movie -> Response.ok(movie).build())
                .orElse(Response.status(NOT_FOUND).build());

    }

    @GET
    @Path("/movieByTitle/{title}")
    public Response getBytitle(@PathParam("title") String title) {
        return movieRepository.find("title", title)
                .singleResultOptional()
                .map(flex -> Response.ok(flex).build())
                .orElse(Response.status(NOT_FOUND).build());

    }
    @GET
    @Path("/movieByCountry/{country}")
    public Response getByCountry(@PathParam("country") String country)  {
        //made findByCountry manually
         List<MovieServiceEntity> movieServiceEntities = movieRepository.findByCountry(country);
         return Response.ok(movieServiceEntities).build();
    }

    @POST
    @Transactional
    public Response create(MovieServiceEntity movieServiceEntity) {
        movieRepository.persist(movieServiceEntity);
        if (movieRepository.isPersistent(movieServiceEntity)) {
            return Response.created(URI.create("/movieServiceEntities/" + movieServiceEntity.getId())).build();
        }
        return Response.status(BAD_REQUEST).build();
    }

    @DELETE
    @Transactional
    @Path("/deleteById/{id}")
    public Response deleteById(@PathParam("id") Long id) {
        boolean deleteById = movieRepository.deleteById(id);
        //the ? is another way of doing if statement
        //and the : means else
        return deleteById ? Response.noContent().build() :
                Response.status(NOT_FOUND).build();
    }


}
//learn how to have response say "Movie is saved"