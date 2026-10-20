class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rowCount = matrix[0].length - 1;

        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][0] <= target && matrix[row][rowCount] >= target) {
                int[] targetArray = matrix[row];
                for(int i = 0; i < targetArray.length; i++) {
                    if (targetArray[i] == target) return true;
                }
            } 
        }

        return false;
    }
}
