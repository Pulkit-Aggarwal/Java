package ArraysAndStrings;

class Q8_Zero_Matrix {
    
    // Time complexity = O(n^2)
    // Space complexity = O(M + N)

    // Can also do it in O(1) if we use the first row and column 
    // of the matrix as the trackers
    public static void getZeroMatrix(int[][] matrix) {
        boolean[] rows = new boolean [matrix.length];
        boolean[] columns = new boolean [matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    columns[j] = true;
                    break;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (rows[i] || columns[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
}