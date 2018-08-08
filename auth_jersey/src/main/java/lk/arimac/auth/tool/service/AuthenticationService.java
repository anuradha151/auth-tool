package lk.arimac.auth.tool.service;


import lk.arimac.auth.tool.model.User;

public class AuthenticationService {

    public User getUserByEmail(String email) {
        User user = new User("Anuradha","anuradha@gmail.com","SE","0767140151","geust","password","salt",2311);
        return user;
    }

}
