package lk.arimac.auth.security;

import lk.arimac.auth.model.Login;
import lk.arimac.auth.model.ResponseLogin;

public class AuthHandling {
    public ResponseLogin loginUser(Login login){
if (!new Validation().isValidEmail(login.getEmail())){
    throw new
}
    }
}
