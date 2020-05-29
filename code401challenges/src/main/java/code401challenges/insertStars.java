package code401challenges;

public class insertStars {
    // Given a string, recursively compute a new string where the identical adjacent characters in the original string are separated by a "*".
    public String insertPairStar(String s) {

        // base case
        if (s==null || s.length()<=1) {
            return s;

            // recursive cases
        } else if (s.charAt(0)==s.charAt(1)) {
            return s.substring(0, 1) + "*" + insertPairStar(s.substring(1, s.length()));
        } else {
            return s.substring(0, 1) + insertPairStar(s.substring(1, s.length()));
        }
    }
}
