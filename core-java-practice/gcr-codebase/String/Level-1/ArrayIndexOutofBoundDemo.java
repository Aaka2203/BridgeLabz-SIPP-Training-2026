import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate exception
    static void generateException(String[] names) {

        // Accessing invalid index
        System.out.println(names[names.length]);
    }

    // Method to handle exception
    static void handleException(String[] names) {

        try {

            System.out.println(names[names.length]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndexOutOfBoundsException Handled: " + e);

        } catch (RuntimeException e) {

            System.out.println("RuntimeException Handled: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];

        System.out.println("Enter 3 Names:");

        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }

        // Uncomment to generate exception
        // generateException(names);

        // Handle exception
        handleException(names);

        sc.close();
    }
}
