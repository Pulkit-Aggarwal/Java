package ArraysAndStrings;

import java.util.Arrays;

// Check number of times each letter occurs in s and
// then checks if same number of times in t

// Time complexity = O(n) where n is the length of the string
// Space complexity is O(1) because the count array can only contain a maximum of 
// 256 characters
public class Q2_CheckPermutation {
    public static boolean isPermutation(String s, String t) {
        int[] count = new int[256];
        if (s.length() != t.length()) {
            return false;
        }
        for (char c : s.toCharArray()) {
            count[c-'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c-'a']--;
        }

        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }


        return true;
    }


    // method 2, cleaner but less efficient
    // sorts the letters in each string and then checks if they are the same

    // Time complexity = O(n log n) where n is the length of the string
    // Space complexity is O(1) because the sort method uses a constant amount of space
    public static boolean isPermutation2(String s, String t) {
        return sort(s).equals(sort(t));
    }

    public static String sort(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

}
