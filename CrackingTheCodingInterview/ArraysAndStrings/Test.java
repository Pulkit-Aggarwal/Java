package ArraysAndStrings;

public class Test {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Testing Arrays and Strings");
        System.out.println();
        testQ1();
        testQ2();
        testQ3();
        testQ4();
        testQ5();
        testQ6();
        testQ7();
        testQ8();
    }


    public static void testQ1() {
        System.out.println("Testing Q1_IsUnique");
        System.out.println("hello = " + Q1_IsUnique.isUnique("hello"));
        System.out.println("world = " + Q1_IsUnique.isUnique("world"));

        System.out.println("Testing Q1_IsUnique approach 2");
        System.out.println("hello = " + Q1_IsUnique.isUnique2("hello"));
        System.out.println("world = " + Q1_IsUnique.isUnique2("world"));
        System.out.println();
    }


    public static void testQ2() {
        System.out.println("Testing Q2_CheckPermutation");
        System.out.println("hello, oellh = " + Q2_CheckPermutation.isPermutation("hello", "oellh"));
        System.out.println("hello, world = " + Q2_CheckPermutation.isPermutation("hello", "world"));

        System.out.println("Testing Q2_CheckPermutation approach 2");
        System.out.println("hello, oellh = " + Q2_CheckPermutation.isPermutation2("hello", "oellh"));
        System.out.println("hello, world = " + Q2_CheckPermutation.isPermutation2("hello", "world"));
        System.out.println();
    }


    public static void testQ3() {
        System.out.println("Testing Q3_URLify");
        System.out.println(Q3_URLify.URLCreator("Mr John Smith    ", 13));
        System.out.println();
    }


    public static void testQ4() {
        System.out.println("Testing Q4_PalindromePermutation");
        System.out.println("tact coa = " + Q4_PalindromePermutation.hasPalindromePermutation("tact coa"));
        System.out.println("hello = " + Q4_PalindromePermutation.hasPalindromePermutation("hello"));
        System.out.println();
    }


    public static void testQ5() {
        System.out.println("Testing Q5_OneAway");
        System.out.println("pale, ple -> " + Q5_OneAway.oneAway("pale", "ple"));
        System.out.println("pales, pale -> " + Q5_OneAway.oneAway("pales", "pale"));
        System.out.println("pale, bale -> " + Q5_OneAway.oneAway("pale", "bale"));
        System.out.println("pale, bake -> " + Q5_OneAway.oneAway("pale", "bake"));
        System.out.println();
    }


    public static void testQ6() {
        System.out.println("Testing Q6_StringCompression");
        System.out.println("aabcccccaaa" + " = " + Q6_StringCompression.compressed("aabcccccaaa"));
        System.out.println();
    }


    public static void testQ7() {
        System.out.println("Testing Q7_Rotate_Matrix");
        int[][] matrix = new int[3][3];
        matrix[0] = new int[]{1, 2, 3};
        matrix[1] = new int[]{4, 5, 6};
        matrix[2] = new int[]{7, 8, 9};

        printMatrix(matrix);
        System.out.println();

        Q7_Rotate_Matrix.rotate(matrix);
        printMatrix(matrix);
        System.out.println();
    }


    public static void testQ8() {
        System.out.println("Testing Q8_Zero_Matrix");
        int[][] matrix = new int[3][3];
        matrix[0] = new int[]{1, 2, 3};
        matrix[1] = new int[]{4, 0, 6};
        matrix[2] = new int[]{7, 0, 9};

        printMatrix(matrix);
        System.out.println();

        Q8_Zero_Matrix.getZeroMatrix(matrix);
        printMatrix(matrix);
        System.out.println();
    }


    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
