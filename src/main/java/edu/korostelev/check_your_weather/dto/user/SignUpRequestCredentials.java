package edu.korostelev.check_your_weather.dto.user;

public class SignUpRequestCredentials {
    private String login;
    private String password;

    public SignUpRequestCredentials(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public SignUpRequestCredentials() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
