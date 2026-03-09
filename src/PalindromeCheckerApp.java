public class PalindromeCheckerApp{

    public static void main(String[] args) {
        String hardcoded = "madam";
        String reversedHardcoded = new StringBuilder(hardcoded).reverse().toString();

        if (hardcoded.equals(reversedHardcoded)) {
            System.out.println("UC2: " + hardcoded + " is a palindrome");
        } else {
            System.out.println("UC2: " + hardcoded + " is not a palindrome");
        }
    }
}
