package ArraysAndStrings;

public class Q5_OneAway {
    public static boolean oneAway(String s, String t) {
        
        if (s.length() == t.length()) {
            return needsReplacement(s, t);
        }

        if (Math.abs(s.length() - t.length()) == 1) {
            return needsInsert(s, t);
        }

        return false;
    }


    // Two ways of doign this:
    // 1- Keep to pointers and check the caharacters 
    //    This means inplace so no memeory overhead 
    // 2- Add letters to a map for the first string 
    //    Iterate through the next one and decrease the letter count 
    //    Check if all the letters in the map are 0
    //    This has a Space Complexity of O(n)

    // Time complexity for both = O(n)
    public static boolean needsReplacement(String s, String t) {
        boolean check = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (check) {
                    return false;
                } else {
                    check = true;
                }
            }
        }

        return true;
    }

    
    // Time complexity O(n)
    // Space complexity O(1)
    public static boolean needsInsert(String s, String t) {
        boolean check = false;
        String big = s.length() > t.length() ? s : t;
        String small = s.length() < t.length() ? s : t;
        int pointerB = 0, pointerS = 0;
        for (int i = 0; i < small.length(); i++) {
            if (big.charAt(pointerB) != small.charAt(pointerS)) {
                if (check) {
                    return false;
                }

                check = true;
                pointerB++;
            } else {
                pointerB++;
                pointerS++;
            }
        }
    
        return true;
    }
}
