class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Find candidate row
        int top = 0, bottom = rows - 1;

        while (top <= bottom) {
            int row = top + (bottom - top) / 2;

            if (target < matrix[row][0]) {
                bottom = row - 1;
            } else if (target > matrix[row][cols - 1]) {
                top = row + 1;
            } else {
                // target must be in this row if it exists

                int l = 0, r = cols - 1;

                while (l <= r) {
                    int mid = l + (r - l) / 2;

                    if (matrix[row][mid] == target) {
                        return true;
                    } else if (matrix[row][mid] < target) {
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }

                return false;
            }
        }

        return false;
    }
}
