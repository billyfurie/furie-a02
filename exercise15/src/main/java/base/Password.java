package base;

public class Password {

    private String password;

    public Password(String password) {
        this.password = password;
    }

    private boolean validate(String attempt) {
        if (attempt.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public String getAuthentication(String attempt) {
        if (validate(attempt)) {
            return "Welcome!";
        } else {
            return "I don't know you.";
        }
    }
}
