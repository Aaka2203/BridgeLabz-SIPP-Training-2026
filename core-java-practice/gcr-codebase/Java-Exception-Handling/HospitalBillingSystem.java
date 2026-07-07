import java.util.Scanner;

// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    public static void processPayment(double billAmount, double amountPaid)
            throws InsufficientFundsException {

        if (amountPaid < billAmount) {
            throw new InsufficientFundsException(
                    "Payment Failed: Insufficient funds. Need Rs." +
                    (billAmount - amountPaid) + " more.");
        }

        System.out.println("Payment Successful!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // NumberFormatException
            System.out.print("Enter total bill amount: ");
            String billInput = sc.nextLine();
            double totalBill = Double.parseDouble(billInput);

            System.out.print("Enter number of items: ");
            String itemInput = sc.nextLine();
            int items = Integer.parseInt(itemInput);

            // ArithmeticException (division by zero)
            double costPerItem = totalBill / items;
            System.out.println("Cost per item: Rs." + costPerItem);

            // ArrayIndexOutOfBoundsException
            String[] patients = {"Rahul", "Priya", "Amit"};
            System.out.print("Enter patient index: ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Patient Name: " + patients[index]);

            // Custom Exception
            System.out.print("Enter payment amount: ");
            double payment = Double.parseDouble(sc.nextLine());

            processPayment(totalBill, payment);

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric input.");

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }

        sc.close();
    }
}
