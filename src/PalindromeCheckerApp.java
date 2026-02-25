import java.util.*;

public class UC6_QueueStackPalindrome {

    public static boolean isPalindrome(String input) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            queue.add(ch);      // Enqueue (FIFO)
            stack.push(ch);     // Push (LIFO)
        }

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam")); // true
        System.out.println(isPalindrome("hello")); // false
    }
}