package Lesson13;

public class authenticateUser {
    static String USERNAME = "admin";
    static String PASSWORD = "12345";
    static void login(String username,String password) throws AuthenticationException{
        if (!USERNAME.equals(username)|| !PASSWORD.equals(password)) {
            throw new AuthenticationException("Invalid usename or password.");

        }

    }
}
