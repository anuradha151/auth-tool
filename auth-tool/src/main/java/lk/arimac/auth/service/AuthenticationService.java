package lk.arimac.auth.service;

import lk.arimac.auth.model.User;

import javax.jws.soap.SOAPBinding;

public class AuthenticationService {

    public User getUserByEmail(String email) {
        User user = new User("Anuradha", "anuranasinghe151@dummy.com", "password");
        return user;
    }

}
