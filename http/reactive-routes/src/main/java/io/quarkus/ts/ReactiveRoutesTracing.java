package io.quarkus.ts;

import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.RouteBase;

@RouteBase(path = "/trace")
public class ReactiveRoutesTracing {
    @Route(methods = Route.HttpMethod.GET, path = "/hello")
    boolean validateRequestSinglePara() {
        return true;
    }
}
