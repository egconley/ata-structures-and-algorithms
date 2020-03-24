package code401challenges;

public class isPalindrome {
    public char firstChar(String str) {
        return str.charAt(0);
    }

    public char lastChar(String str) {
        return str.charAt(str.length()-1);
    }

    public String middleChars(String str) {
        return str.substring(1, str.length()-1);
    }

    public boolean isPalindrome(String str) {
        if (str.length() <=1) {
            return true;
        } else if (firstChar(str) != lastChar(str)) {
            return false;
        } else if (str.length()==2 && firstChar(str) == lastChar(str)){
            return true;
        } else {
            return isPalindrome(middleChars(str));
        }
    }
}
