package net.hassannazar;

import net.hassannazar.gateway.HelloResourceGateway;
import org.eclipse.microprofile.rest.client.RestClientBuilder;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        final var helloResourceGateway = RestClientBuilder.newBuilder()
                .baseUri(new URI("http://localhost:8080/"))
                .build(HelloResourceGateway.class);

        final var resp = helloResourceGateway.hello("from javase");
        System.out.println("helloResourceGateway = " + resp);
    }
}
