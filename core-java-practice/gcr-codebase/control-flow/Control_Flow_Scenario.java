// a kingdom's tax system charges 5% for income <10k ,15% for income between 10k- 50k, 30% above 50k . Read a citizen's income and print the tax bracket and amount .Extend : loop over an array of 10 citizens and tally total tax collected.
public class Control_Flow_Scenario {

    static double calculateTax(double income) {
        if (income < 10000) {
            return income * 0.05; // 5% tax
        } else if (income >= 10000 && income <= 50000) {
            return income * 0.15; // 15% tax
        } else {
            return income * 0.30; // 30% tax
        }
    }
    public static void main(String[] args) {
        double[] incomes = {5000, 15000, 30000, 60000, 8000, 12000, 45000, 70000, 9000, 20000};
        double totalTaxCollected = 0;

        for (double income : incomes) {
            double tax = calculateTax(income);
            totalTaxCollected += tax;
            System.out.println("Income: " + income + " - Tax: " + tax);
        }

        System.out.println("Total Tax Collected: " + totalTaxCollected);
    }

    
    
}
