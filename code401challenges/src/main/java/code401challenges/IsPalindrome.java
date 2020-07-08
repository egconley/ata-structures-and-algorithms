package code401challenges;

public class IsPalindrome {

    public boolean isPalindrome(String str) {
        if (str==null || str.length()==1) {
            return true;
        } else {
            boolean answer = true;
            int lastIdx = str.length()-1;
            for (int i=0; i<str.length()/2; i++) {
                Character front = str.charAt(i);
                Character back = str.charAt(lastIdx-i);
                if (front!=back) {
                    answer = false;
                }
            }
            return answer;
        }
    }
}
