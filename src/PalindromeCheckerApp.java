public class UC9_RecursivePalindrome {

    public static boolean isPalindrome(String input) {
        return check(input, 0, input.length() - 1);
    }

    private static boolean check(String str, int left, int right) {
        if (left >= right) return true;  // Base condition

        if (str.charAt(left) != str.charAt(right))
            return false;

        return check(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("noon"));  // true
        System.out.println(isPalindrome("apple")); // false
    }
}