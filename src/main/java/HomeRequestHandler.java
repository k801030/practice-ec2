import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/home")
public class HomeRequestHandler {
    private String hello ="Hi! Welcome to EC2.";
    @GET

    public String getHome() {
        return hello;
    }
}
