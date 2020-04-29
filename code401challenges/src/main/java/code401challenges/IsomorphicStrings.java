package code401challenges;

import java.util.HashMap;

public class IsomorphicStrings {

    public boolean isIsomorphic(String input1, String input2) {
        if (input1.length() != input2.length()) {
            return false;
        } else {

            HashMap<Character, Character> mapAB = new HashMap<>();
            HashMap<Character, Character> mapBA = new HashMap<>();

            for (int i=0; i<input1.length(); i++) {
                Character curr1 = input1.charAt(i);
                Character curr2 = input2.charAt(i);

                // forward
                if (!mapAB.containsKey(curr1)) {
                    mapAB.put(curr1, curr2);
                } else {
                    if (mapAB.get(curr1) != curr2) {
                        return false;
                    }
                }

                // backward
                if (!mapBA.containsKey(curr2)) {
                    mapBA.put(curr2, curr1);
                } else {
                    if (mapBA.get(curr2) != curr1) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

}
