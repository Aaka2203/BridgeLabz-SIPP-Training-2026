import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    static void generateException(String text) {

        // Accessing invalid index
        System.out.println(text.charAt(text.length()));
    }

    static void handleException(String text) {

        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Handled: " + e);
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
