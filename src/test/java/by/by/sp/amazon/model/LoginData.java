package by.by.sp.amazon.model;

public class LoginData {
    private final String login;
    private final String password;


    public LoginData(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

}
