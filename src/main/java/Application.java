import Verticles.HTTPServerVerticle;
import io.vertx.core.Vertx;

/**
 * Created by navx2 on 8/8/2015.
 */
public class Application {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();

        vertx.deployVerticle(new HTTPServerVerticle());
    }
}
