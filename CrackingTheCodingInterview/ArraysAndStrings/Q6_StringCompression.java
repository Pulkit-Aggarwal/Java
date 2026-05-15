package ArraysAndStrings;

public class Q6_StringCompression {
    public static String compressed (String s) {

        if (s.length() == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int currentchar = s.charAt(0);
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == currentchar) {
                count++;
            } else {
                sb.append(currentchar);
                sb.append(count + "");
                currentchar = c;
                count = 1;
            }
        }

        sb.append(currentchar);
        sb.append(count + "");

        return sb.toString();
    }
}
