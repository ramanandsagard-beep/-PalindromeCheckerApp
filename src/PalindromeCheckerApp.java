import java.util.*;

public class UC7_DequePalindrome {

    public static boolean isPalindrome(String input) {
        Deque<Character> deque = new LinkedList<>();

        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("level")); // true
        System.out.println(isPalindrome("world")); // false
    }
}