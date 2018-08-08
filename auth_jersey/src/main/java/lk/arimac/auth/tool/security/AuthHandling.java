package lk.arimac.auth.tool.security;

import lk.arimac.auth.tool.exception.PMException;
import lk.arimac.auth.tool.filter.role.Role;
import lk.arimac.auth.tool.model.Login;
import lk.arimac.auth.tool.model.ResponseLogin;
import lk.arimac.auth.tool.model.User;
import lk.arimac.auth.tool.service.AuthenticationService;

import java.util.UUID;

public class AuthHandling {
    public ResponseLogin loginUser(Login login) {
        if (!new Validation().isValidEmail(login.getEmail())) {
            throw new PMException("Please enter valid email address");
        }
        AuthenticationService service = new AuthenticationService();
        User userByEmail = service.getUserByEmail(login.getEmail());
        if (userByEmail == null) {
            throw new PMException("Email does not exsits");
        }
        if (userByEmail.getPassword() != null) {
//            encrypt password here
//            login.getPassword() -> encrypt password
            if (!login.getPassword().equals(userByEmail.getPassword())) {
                throw new PMException("Incorrect password");
            }

        }
        ResponseLogin responseLogin = new ResponseLogin();
        responseLogin.setUserId(Integer.toString(userByEmail.getUser_id()));
        responseLogin.setSecretKey(UUID.randomUUID().toString().replaceAll("-", ""));
        String token = new Validation().createJWT(Integer.toString(userByEmail.getUser_id()),responseLogin.getSecretKey(), Role.GUEST);
        responseLogin.setToken(token);
        return responseLogin;
    }
}
