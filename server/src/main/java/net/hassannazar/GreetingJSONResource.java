package net.hassannazar;

import net.hassannazar.model.Greeting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("greeting")
@Produces(MediaType.APPLICATION_JSON)
public class GreetingJSONResource {

    @GET
    public Response greet(){
        final var greeting = new Greeting("Hello", "Hassan");
        return Response.ok(greeting).build();
    }

}
