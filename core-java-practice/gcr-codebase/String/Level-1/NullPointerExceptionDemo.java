public class NullPointerExceptionDemo {

    static void generateException() {
        String text = null;

        // Generates NullPointerException
        System.out.println(text.length());
    }

    static void handleException() {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception Handled: " + e);
        }
    }

    public static void main(String[] args) {

        // Uncomment to generate exception
        // generateException();

        handleException();
    }
}
