public class UC8_LinkedListPalindrome {

    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
        }
    }

    public static boolean isPalindrome(String input) {
        if (input == null || input.length() <= 1) return true;

        Node head = buildList(input);

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverse(slow);
        Node copySecondHalf = secondHalf;

        Node firstHalf = head;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        reverse(copySecondHalf); // restore list (optional)
        return true;
    }

    private static Node buildList(String input) {
        Node head = new Node(input.charAt(0));
        Node current = head;

        for (int i = 1; i < input.length(); i++) {
            current.next = new Node(input.charAt(i));
            current = current.next;
        }
        return head;
    }

    private static Node reverse(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("radar")); // true
        System.out.println(isPalindrome("java"));  // false
    }
}