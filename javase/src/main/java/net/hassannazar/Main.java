package net.hassannazar;

import net.hassannazar.gateway.GreeterJsonGateway;
import net.hassannazar.gateway.HelloResourceGateway;
import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;


import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        final var clientBuilder = RestClientBuilder.newBuilder()
                .register(JacksonJsonProvider.class)
                .register(JacksonJaxbJsonProvider.class)
                .baseUri(new URI("http://localhost:8080/"));


        final var helloResourceGateway = clientBuilder.build(HelloResourceGateway.class);
        final var greeterJsonGateway = clientBuilder.build(GreeterJsonGateway.class);

        final var resp = helloResourceGateway.hello("from javase");
        final var greeting = greeterJsonGateway.greet();
        System.out.println("helloResourceGateway = " + resp);
        System.out.println("greeting = " + greeting);
    }
}
