package ArraysAndStrings;


// Replaces the spaces in a string with %20 and assumes that 
// there is enough space at the end of the string to hold the 
// additional characters
public class Q3_URLify {

    // Time complexity = O(n) where n is the length of the string
    // Space complexity is O(1) because it is done in place
    public static String URLCreator(String s, int n) {

        if (s.length() <= 1) {
            return s;
        }

        char[] letters = s.toCharArray();

        // Maintain where the last letter is 
        int counter = letters.length - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (letters[i] != ' ') {
                letters[counter--] = letters[i];
            } else {
                letters[counter--] = '0';
                letters[counter--] = '2';
                letters[counter--] = '%';
            }
        
        }
        
        return new String(letters);
    }
}
