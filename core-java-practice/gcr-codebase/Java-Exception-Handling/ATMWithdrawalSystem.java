class InsufficientBalanceException extends Exception {

    private double balance;
    private double requestedAmount;

    public InsufficientBalanceException(double balance, double requestedAmount) {
        super("Insufficient Balance!");
        this.balance = balance;
        this.requestedAmount = requestedAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }
}

public class ATM {

    public static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        System.out.println("Withdrawal Successful!");
    }

    public static void main(String[] args) {

        double balance = 5000;
        double withdrawalRequest = 8000;

        try {
            withdraw(balance, withdrawalRequest);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed!");
            System.out.println("Available Balance: ₹" + e.getBalance());
            System.out.println("Requested Amount: ₹" + e.getRequestedAmount());
            System.out.println(e.getMessage());
        }
    }
}
