package net.hassannazar.gateway;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("hello")
@Produces(MediaType.APPLICATION_JSON)
public interface HelloResourceGateway {

    @GET
    String hello(@QueryParam("append") String hello);

}
