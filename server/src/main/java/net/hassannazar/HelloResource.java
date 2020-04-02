package net.hassannazar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("hello")
public class HelloResource {

    @GET
    public String hello(@QueryParam("append") String append) {
        return "Hello " + append;
    }
}
