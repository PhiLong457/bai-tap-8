package Practice.Assignment8;

public class Palindrome_String {
 
    public static boolean isPalindrome(String s) {
        
        if (s == null || s.trim().isEmpty()) {
            return false;  
        }
        s = s.replaceAll("\\s+", "").toLowerCase();

        StringBuilder reversed = new StringBuilder(s);
        reversed.reverse();

        return s.equals(reversed.toString());
    }

    public static void main(String[] args) {
       
        System.out.println(isPalindrome("madam"));  
    }
}