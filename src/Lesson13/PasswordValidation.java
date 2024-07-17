package Lesson13;

public class PasswordValidation {
    static void validatePassword(String password) throws InvalidPasswordException{
        if (password.length()<8){
            throw new InvalidPasswordException("Password must be at leasstcharacters long.");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new InvalidPasswordException("Password must contain at least one uppercase letter.");
        }
        if (!password.matches(".*[a-z].*")) {
            throw new InvalidPasswordException("Password must contain at least one lowercase letter.");
        }
        if (!password.matches(".*\\d*.")) {
            throw new InvalidPasswordException("Password must contain at least one digit.");

        }

    }
}
