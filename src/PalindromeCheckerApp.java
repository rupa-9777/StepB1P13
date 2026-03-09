import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

interface PalindromeStrategy {
    boolean isPalindrome(String word);
}

class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String word){

        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray()){
            stack.push(c);
        }

        String reversed = "";

        while(!stack.isEmpty()){
            reversed += stack.pop();
        }

        return word.equals(reversed);
    }
}

class DequeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String word){

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : word.toCharArray()){
            deque.addLast(c);
        }

        while(deque.size() > 1){
            if(deque.removeFirst() != deque.removeLast()){
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "racecar";

        PalindromeStrategy strategy;

        strategy = new StackStrategy();

        if(strategy.isPalindrome(word)){
            System.out.println(word + " is a palindrome using Stack Strategy");
        } else {
            System.out.println(word + " is not a palindrome");
        }

        strategy = new DequeStrategy();

        if(strategy.isPalindrome(word)){
            System.out.println(word + " is a palindrome using Deque Strategy");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}