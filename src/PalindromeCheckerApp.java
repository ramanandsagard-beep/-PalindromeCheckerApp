public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String text = "radar";
        char[] chars = text.toCharArray();

        int left = 0;
        int right = chars.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}