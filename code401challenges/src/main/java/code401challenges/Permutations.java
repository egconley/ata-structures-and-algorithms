package code401challenges;

import java.util.HashMap;

public class Permutations {

    // checks if two strings are permutations of each other
    public boolean permutation(String str1, String str2) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        if (str1!=null) {
            for (int i=0; i<str1.length(); i++) {
                Character current1 = str1.charAt(i);
                if (map1.containsKey(current1)) {
                    int count = map1.get(current1);
                    map1.put(current1, count+1);
                } else {
                    map1.put(current1, 1);
                }
            }
        }

        if (str2!=null) {
            for (int j=0; j<str2.length(); j++) {
                Character current2 = str2.charAt(j);
                if (map2.containsKey(current2)) {
                    int count = map2.get(current2);
                    map2.put(current2, count+1);
                } else {
                    map2.put(current2, 1);
                }
            }
        }

        return map1.equals(map2);
    }
}
