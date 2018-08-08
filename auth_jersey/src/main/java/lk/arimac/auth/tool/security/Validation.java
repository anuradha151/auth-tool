package lk.arimac.auth.tool.security;


import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.Calendar;
import java.util.Date;

public class Validation {
    public boolean isValidEmail(String email){
        try {
            new InternetAddress(email).validate();
        } catch (AddressException e) {
            return false;
        }
        return true;
    }
    public String createJWT(String userId, String key,String role){
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE, 1);
        JwtBuilder jwtBuilder = Jwts.builder()
                .setId(userId)
                .setIssuedAt(new Date())
                .setSubject(role)
                .signWith(SignatureAlgorithm.HS256, key)
                .setExpiration(instance.getTime());
        return jwtBuilder.compact();
    }
//    create password encryption method

}
