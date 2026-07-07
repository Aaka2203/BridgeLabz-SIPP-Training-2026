public class PasswordStrengthChecker {

    public static void checkPassword(String password) {

        try {

            if (password == null) {
                throw new NullPointerException();
            }

            if (password.isEmpty()) {
                System.out.println("Error: Password cannot be empty.");
                return;
            }

            if (password.length() < 8) {
                System.out.println("Error: Password must be at least 8 characters long.");
                return;
            }

            if (!Character.isUpperCase(password.charAt(0))) {
                System.out.println("Error: First character must be uppercase.");
                return;
            }

            if (!Character.isDigit(password.charAt(password.length() - 1))) {
                System.out.println("Error: Last character must be a digit.");
                return;
            }

            boolean hasSpecial = false;

            for (char ch : password.toCharArray()) {
                if ("@#$%&*".indexOf(ch) != -1) {
                    hasSpecial = true;
                    break;
                }
            }

            if (!hasSpecial) {
                System.out.println("Error: Password must contain at least one special character (@,#,$,%,&,*).");
                return;
            }

            System.out.println("Password is Strong.");

        } catch (NullPointerException e) {
            System.out.println("Error: Password cannot be null.");
        } catch (Exception e) {
            System.out.println("Error: Invalid password.");
        }
    }

    public static void main(String[] args) {

        checkPassword("");            // Empty
        checkPassword("Abc@1");       // Less than 8 chars
        checkPassword("abcdefg@1");   // First char not uppercase
        checkPassword("Abcdefgh@");   // Last char not digit
        checkPassword("Abcdefgh1");   // No special character
        checkPassword(null);          // Null
        checkPassword("Abcd@123");    // Valid
    }
}
