package org.acme;

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

@Path("/movies")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MovieResource {

    @GET

    public Response getAll() {
        List <MoviesEntity> moviesEntityList = MoviesEntity.listAll();
        return Response.ok(moviesEntityList).build();
    }

    @GET
    @Path("/{id}")
    public Response getById(@PathParam("id") Long id) {
       return MoviesEntity.findByIdOptional(id)
                .map(movie -> Response.ok(movie).build())
                .orElse(Response.status(Response.Status.NOT_FOUND).build());

    }

    @GET
    @Path("/country/{country}")
    public Response getByCountry(@PathParam("country") String country) {
        List<MoviesEntity> moviesEntities = MoviesEntity.list("SELECT m FROM MoviesEntity m WHERE m.country = ?1 ORDER BY id " +
                "DESC", country);
        return Response.ok(moviesEntities).build();
    }

    @GET
    @Path("/title/{title}")
    public Response getByTitle(@PathParam("title") String title) {
        //will find movie by specifc title
       return MoviesEntity.find("title", title)
                .singleResultOptional()
                .map(movie -> Response.ok(movie).build())
                .orElse(Response.status(Response.Status.NOT_FOUND).build());
    }

    @POST
    @Transactional //will roll back to normal if bad request
    public Response createMovie(MoviesEntity movies) {
        MoviesEntity.persist(movies);
        if (movies.isPersistent()) {
            return Response.created(URI.create("/movies" + movies.id)).build();
        }
        return Response.status(Response.Status.BAD_REQUEST).build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response deleteById(@PathParam("id") Long id) {
        boolean deleted = MoviesEntity.deleteById(id);
        if (deleted) {
            return Response.noContent().build();
        }
        return Response.status(Response.Status.BAD_REQUEST).build();

    }

}