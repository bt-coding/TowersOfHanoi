public class palindromes {
    public static boolean isPalindrome(String txt) {
        if (txt.length() <= 1) {
            return true;
        }
        else if (txt.substring(0,1).equals(txt.substring(txt.length()-1))) {
            return isPalindrome(txt.substring(1,txt.length()-1));
        } else {            
            return false;
        }
    }
}