package io.quarkus.qe.messaging.infinispan.quickstart;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.infinispan.client.hotrod.RemoteCache;

import io.quarkus.infinispan.client.Remote;

@Path("/infinispan")
public class GreetingCachedResource {

    @Inject
    @Remote("mycache")
    RemoteCache<String, String> cache;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return cache.get("hello");
    }
}
