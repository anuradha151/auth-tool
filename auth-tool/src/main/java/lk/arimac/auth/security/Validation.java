package lk.arimac.auth.security;


import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class Validation {
    public boolean isValidEmail(String email){
        try {
            new InternetAddress(email).validate();
        } catch (AddressException e) {
            return false;
        }
        return true;
    }
}
