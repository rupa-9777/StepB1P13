import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker - UC4");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] charArray = input.toCharArray();

        // Two-pointer technique
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

        scanner.close();
    }
}

