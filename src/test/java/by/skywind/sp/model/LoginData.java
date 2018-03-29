package by.skywind.sp.model;

public class LoginData {
    private final String login;
    private final String password;
    private String managerCredential;

    public LoginData(String login, String password, String managerCredential) {
        this.login = login;
        this.password = password;
        this.managerCredential = managerCredential;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getManagerCredential() {
        return managerCredential;
    }
}
