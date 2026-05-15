package ArraysAndStrings;

public class Q9_String_Rotation {

    // This is a theoretical question and this is the solution that is also in the book

    // Time complexity = O(n) where n is the length of the string
    // Space complexity = O(1)
    public boolean isStringRotation(String s, String t) {
        if (s.length() == t.length() && s.length() > 0) {
            // s = s + s;
            // isSubstring(t, s);
            return true; // the value for isSubstring(s, t)
        }

        return false;
    }
}
