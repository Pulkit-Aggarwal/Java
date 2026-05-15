package ArraysAndStrings;

import java.util.HashMap;

public class Q4_PalindromePermutation {

    // Time complexity = O(n) where n is the length of the string
    // Space complexity is O(k) where k is the number of distinct characters in string s
    public static boolean hasPalindromePermutation(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                continue;
            } 

            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        boolean check = false;
        for (Integer i : map.values()) {
            if (i % 2 == 1) {
                if (check) {
                    return false; 
                }

                check = true;
            }
        }

        return true;

    }


}
