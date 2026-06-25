import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    static void generateException(String text) {

        // start index > end index
        System.out.println(text.substring(5, 2));
    }

    static void handleException(String text) {

        try {
            System.out.println(text.substring(5, 2));

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException Handled: " + e);

        } catch (RuntimeException e) {
            System.out.println("RuntimeException Handled: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.next();

        // Uncomment to generate exception
        // generateException(text);

        handleException(text);

        sc.close();
    }
}
