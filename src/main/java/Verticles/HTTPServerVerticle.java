package Verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonObject;

/**
 * Created by navx2 on 8/8/2015.
 */
public class HTTPServerVerticle extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        HttpServer server = vertx.createHttpServer();

        server.requestHandler(request -> {
            HttpServerResponse response = request.response();

            response.putHeader("Content-Type", "application/json")
                    .end(new JsonObject().put("message", "well, this worked.").encode());
        }).listen(8080);
    }
}
