class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int left = 0;
        int right = rows * columns - 1;

        while(left <= right)
        {
            int mid = left + (right - left)/2;

            int mid_val = matrix[mid/columns][mid%columns];

            if(mid_val == target)
                return true;
            else if(mid_val < target)
                left = mid + 1;
            else if(mid_val > target)
                right = mid - 1;
        }

        return false;
    }
}
