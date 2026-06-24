import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        boolean first = (number1 > number2 && number1 > number3);
        boolean second = (number2 > number1 && number2 > number3);
        boolean third = (number3 > number1 && number3 > number2);

        System.out.println("Is the first number the largest? " + first);
        System.out.println("Is the second number the largest? " + second);
        System.out.println("Is the third number the largest? " + third);
    }
}
