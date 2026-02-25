public class UC13_PerformanceComparison {

    public static boolean iterativeCheck(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static boolean recursiveCheck(String str, int left, int right) {
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)) return false;
        return recursiveCheck(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String test = "A man a plan a canal Panama".replaceAll("\\s+", "").toLowerCase();

        long start = System.nanoTime();
        iterativeCheck(test);
        long end = System.nanoTime();
        System.out.println("Iterative Time: " + (end - start) + " ns");

        start = System.nanoTime();
        recursiveCheck(test, 0, test.length() - 1);
        end = System.nanoTime();
        System.out.println("Recursive Time: " + (end - start) + " ns");
    }
}