package ArraysAndStrings.Q1;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {

    // Add all letters to a set and then check if there are duplicates.
    // Can also check the length of set and string are same but in this
    // way it returns earlier

    // Time complexity = O(n) where n is the length of the string
    // Space complexity is O(1) because the set can only contain a maximum of 65535 characters
    public boolean isUnique(String s) {
        Set<Character> letters = new HashSet<Character>();
        for (char c : s.toCharArray()) {
            if (letters.contains(c)) {
                return false;
            }
           letters.add(c);
        }
        return true;
    }

    // Alternative approach is to have a boolean array and then check
    // if the character has been seen before and then return true or false

    // Time complexity = O(n) where n is the length of the string
    // Space complexity is O(1) because the boolean array can only contain a maximum of 65535 characters
    public boolean isUnique2(String s) {
        if (s.length() > Character.MAX_VALUE + 1) {
            return false;
        }
        boolean[] seen = new boolean[Character.MAX_VALUE + 1];
        for (char c: s.toCharArray()) {
            int index = (int) c;
            if (seen[index]) {
                return false;
            }
            seen[index] = true;
        }
        return true;
    }
}
