class Node {
    char data;
    Node next;

    Node(char data){
        this.data = data;
        this.next = null;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "radar";

        Node head = null;
        Node tail = null;

        for(char c : text.toCharArray()){
            Node newNode = new Node(c);
            if(head == null){
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        String original = "";
        String reverse = "";

        Node temp = head;

        while(temp != null){
            original += temp.data;
            reverse = temp.data + reverse;
            temp = temp.next;
        }

        if(original.equals(reverse)){
            System.out.println(text + " is a palindrome");
        } else {
            System.out.println(text + " is not a palindrome");
        }
    }
}