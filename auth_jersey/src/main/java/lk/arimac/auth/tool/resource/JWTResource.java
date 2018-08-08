package lk.arimac.auth.tool.resource;


import lk.arimac.auth.tool.model.Login;
import lk.arimac.auth.tool.model.ResponseLogin;
import lk.arimac.auth.tool.security.AuthHandling;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/auth")
public class    JWTResource {

    @POST
    @Path("login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseLogin login(Login login) {
        AuthHandling authHandling = new AuthHandling();
        return authHandling.loginUser(login);
    }

}
