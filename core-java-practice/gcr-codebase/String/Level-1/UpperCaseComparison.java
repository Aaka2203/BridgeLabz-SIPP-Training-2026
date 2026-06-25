import java.util.Scanner;

public class UpperCaseComparison {

    // Convert to uppercase using charAt()
    static String convertToUpperCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            result += ch;
        }

        return result;
    }

    // Compare two strings using charAt()
    static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {

            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String userUpperCase = convertToUpperCase(text);

        String builtInUpperCase = text.toUpperCase();

        System.out.println("User Defined Uppercase: " + userUpperCase);
        System.out.println("Built-in Uppercase: " + builtInUpperCase);

        boolean result = compareStrings(userUpperCase, builtInUpperCase);

        System.out.println("Are Both Strings Equal? " + result);

        sc.close();
    }
}
