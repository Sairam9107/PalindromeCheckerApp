class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

 class PalindromeChecker {
    public static void uc8_LinkedListMethod() {
        String input = "madam";

        // 1. Convert string to linked list
        Node head = null, tail = null;
        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // 2. Find middle using slow & fast pointers
        //
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 3. Reverse second half
        //
        Node prev = null;
        Node current = slow;
        while (current != null) {
            Node nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }

        // 4. Compare both halves
        Node first = head;
        Node second = prev; // 'prev' is now the head of the reversed second half
        boolean isPalindrome = true;

        while (second != null) {
            if (first.data != second.data) {
                isPalindrome = false;
                break;
            }
            first = first.next;
            second = second.next;
        }

        System.out.println("UC8 Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    public static void main(String[] args) {
        uc8_LinkedListMethod();
    }
}