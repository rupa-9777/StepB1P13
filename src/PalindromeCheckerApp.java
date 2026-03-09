public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "radar";

        char[] arr = text.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        boolean isPalindrome = true;

        while(start < end){
            if(arr[start] != arr[end]){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if(isPalindrome){
            System.out.println(text + " is a palindrome");
        } else {
            System.out.println(text + " is not a palindrome");
        }
    }
}