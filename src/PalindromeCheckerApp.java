public class PalindromeChecker {

    public boolean checkPalindrome(String input) {
        if (input == null) return false;

        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        int left = 0, right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        System.out.println(checker.checkPalindrome("Madam")); // true
    }
}