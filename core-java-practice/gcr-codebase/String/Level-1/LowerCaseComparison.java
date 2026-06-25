import java.util.Scanner;

public class LowerCaseComparison {

    // Convert to lowercase using charAt()
    static String convertToLowerCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
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

        String userLowerCase = convertToLowerCase(text);

        String builtInLowerCase = text.toLowerCase();

        System.out.println("User Defined Lowercase: " + userLowerCase);
        System.out.println("Built-in Lowercase: " + builtInLowerCase);

        boolean result = compareStrings(userLowerCase, builtInLowerCase);

        System.out.println("Are Both Strings Equal? " + result);

        sc.close();
    }
}

