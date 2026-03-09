import java.util.Stack;

public class UseCase13PalindromeCheckerApp {

    public static boolean reverseMethod(String word){

        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--){
            reversed = reversed + word.charAt(i);
        }

        return word.equals(reversed);
    }

    public static boolean stackMethod(String word){

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

    public static void main(String[] args) {

        String word = "level";

        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(word);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = stackMethod(word);
        long end2 = System.nanoTime();

        System.out.println("Reverse Method Result: " + result1);
        System.out.println("Reverse Method Time: " + (end1 - start1));

        System.out.println("Stack Method Result: " + result2);
        System.out.println("Stack Method Time: " + (end2 - start2));
    }
}