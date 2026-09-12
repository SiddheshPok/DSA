class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int num = matrix[0][0];
        int k = 0;
        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
            k++;
        }
        return true;
    }
}