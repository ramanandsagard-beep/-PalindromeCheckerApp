public class UC10_NormalizedPalindrome {

    public static boolean isPalindrome(String input) {
        String normalized = input
                .replaceAll("[^a-zA-Z0-9]", "") // remove spaces & symbols
                .toLowerCase();

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
        System.out.println(isPalindrome("A man a plan a canal Panama")); // true
        System.out.println(isPalindrome("Hello World")); // false
    }
}