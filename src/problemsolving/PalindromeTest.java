package problemsolving;

/**
 * this operation to check given word is palindrome
 */
public class PalindromeTest {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println("It is Palindrome word: "+isPalindrome(str));
    }

    public static boolean isPalindrome(String str){
        if(str.isEmpty())
            return false;

        String reverseStr = new StringBuffer(str).reverse().toString();
        return str.compareTo(reverseStr) == 0;
    }
}
