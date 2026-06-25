import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate exception
    static void generateException(String text) {

        // Throws NumberFormatException if text is not a valid number
        int number = Integer.parseInt(text);

        System.out.println("Number = " + number);
    }

    // Method to handle exception
    static void handleException(String text) {

        try {

            int number = Integer.parseInt(text);

            System.out.println("Number = " + number);

        } catch (NumberFormatException e) {

            System.out.println("NumberFormatException Handled: " + e);

        } catch (RuntimeException e) {

            System.out.println("RuntimeException Handled: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String text = sc.next();

        // Uncomment to generate exception
        // generateException(text);

        // Handle exception
        handleException(text);

        sc.close();
    }
}
