public class CheckPalindromeString {
    // Attribute
    private final String text;

    // Constructor
    public CheckPalindromeString(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        CheckPalindromeString check1 = new CheckPalindromeString("madam");
        CheckPalindromeString check2 = new CheckPalindromeString("hello");

        // Display the result
        check1.displayResult();
        check2.displayResult();
    }
}
