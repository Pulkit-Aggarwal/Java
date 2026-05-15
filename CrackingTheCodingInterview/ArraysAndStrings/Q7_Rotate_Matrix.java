package ArraysAndStrings;

public class Q7_Rotate_Matrix {

    // Time complexity = O(n^2)
    // Space complexity = O(1)
    public static void rotate(int[][] matrix) {
        int temp = 0;

        // This will transpose the matrix 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++){
                temp = matrix[i][j]; 
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // This will reverse the rows
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length / 2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - j - 1];
                matrix[i][matrix[i].length - j - 1] = temp;
            }
        }

    }
}
