package code401challenges;

import java.util.HashMap;

public class MakeAnagram {
    // returns the number of deletions required to make to strings anagrams of each other
    static int makeAnagram(String a, String b) {

        HashMap<Character, Integer> commonMap = new HashMap<>();
        HashMap<Character, Integer> aMap = new HashMap<>();
        HashMap<Character, Integer> bMap = new HashMap<>();

        int deletions = 0;

        // populate aMap with chars from a, along with frequencies
        for (int i=0; i<a.length(); i++) {
            Character aCurrent = a.charAt(i);
            if (aMap.containsKey(aCurrent)) {
                int freq = aMap.get(aCurrent);
                aMap.put(aCurrent, freq + 1);
            } else {
                aMap.put(aCurrent, 1);
            }
        }

        // populate bMap with chars from b, along with frequencies
        for (int i=0; i<b.length(); i++) {
            Character bCurrent = b.charAt(i);
            if (bMap.containsKey(bCurrent)) {
                int freq = bMap.get(bCurrent);
                bMap.put(bCurrent, freq +1);
            } else {
                bMap.put(bCurrent, 1);
            }

            if (aMap.containsKey(bCurrent)) {
                int minFreq = Math.min(aMap.get(bCurrent), bMap.get(bCurrent));
                commonMap.put(bCurrent, minFreq);
            }
        }

        // count deletions - compare aMap and bMap to commonMap
        for (Character letter : aMap.keySet()) {
            if (commonMap.containsKey(letter)) {
                deletions = deletions + Math.abs(aMap.get(letter)-commonMap.get(letter));
            } else {
                deletions = deletions + aMap.get(letter);
            }
        }

        for (Character letter : bMap.keySet()) {
            if (commonMap.containsKey(letter)) {
                deletions = deletions + Math.abs(bMap.get(letter)-commonMap.get(letter));
            } else {
                deletions = deletions + bMap.get(letter);
            }
        }

        return deletions;
    }
}
