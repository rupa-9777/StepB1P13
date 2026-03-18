import java.util.Stack;

class PalindromeChecker {

    public boolean checkPalindrome(String word){

        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray()){
            stack.push(c);
        }

        String reversed = "";

        while(!stack.isEmpty()){
            reversed = reversed + stack.pop();
        }

        return word.equals(reversed);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        PalindromeChecker checker = new PalindromeChecker();

        if(checker.checkPalindrome(word)){
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}