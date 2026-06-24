import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double physics = sc.nextDouble();
        double chemistry = sc.nextDouble();
        double maths = sc.nextDouble();

        double average = (physics + chemistry + maths) / 3;
        String grade, remarks;

        if (average >= 80) {
            grade = "A";
            remarks = "Level 4";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Level 3";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Level 2";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-";
        } else {
            grade = "R";
            remarks = "Remedial Standards";
        }

        System.out.println("Average = " + average);
        System.out.println("Grade = " + grade);
        System.out.println("Remarks = " + remarks);
    }
}
