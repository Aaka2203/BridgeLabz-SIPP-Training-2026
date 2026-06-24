import java.util.Scanner;

public class NaturalSumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            int sum = 0;
            int i = 1;

            while (i <= n) {
                sum += i;
                i++;
            }

            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using While Loop = " + sum);
            System.out.println("Sum using Formula = " + formulaSum);
            System.out.println("Both results are equal? " + (sum == formulaSum));
        } else {
            System.out.println("Not a Natural Number");
        }
    }
}
