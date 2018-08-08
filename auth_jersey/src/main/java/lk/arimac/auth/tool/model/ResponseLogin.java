package lk.arimac.auth.tool.model;

import java.io.Serializable;

public class ResponseLogin implements Serializable {
    private String userId;
    private String token;
    private String secretKey;
    private boolean isSuccess;
    private String desc;

    public ResponseLogin() {
    }

    public ResponseLogin(String userId, String token, String secretKey, boolean isSuccess, String desc) {
        this.setUserId(userId);
        this.setToken(token);
        this.setSecretKey(secretKey);
        this.setSuccess(isSuccess);
        this.setDesc(desc);
    }

    @Override
    public String toString() {
        return "ResponseLogin{" +
                "userId='" + getUserId() + '\'' +
                ", token='" + getToken() + '\'' +
                ", secretKey='" + getSecretKey() + '\'' +
                ", isSuccess=" + isSuccess() +
                ", desc='" + getDesc() + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
