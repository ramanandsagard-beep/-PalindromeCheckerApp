import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String text = "madam";
        Stack<Character> stack = new Stack<>();

        // Push all characters into the stack
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop and compare with original string
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}