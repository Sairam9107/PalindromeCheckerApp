 class PalindromeChecker {

    public static void uc9_RecursiveMethod() {
        String input = "racecar";

        // Calling the recursive helper function
        boolean isPalindrome = isPalindromeRecursive(input, 0, input.length() - 1);

        System.out.println("UC9 Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome + "\n");
    }

    // The recursive helper method
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        // Base Case: If pointers meet or cross, it's a palindrome
        if (start >= end) {
            return true;
        }

        // Check if characters at current pointers match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive Step: Move pointers inward
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        uc9_RecursiveMethod();
    }
}