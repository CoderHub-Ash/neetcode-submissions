class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int mid = 0;
        
        for( int i = 0; i < matrix.length; i++)
        {
            int left = 0;
            int right = matrix[i].length - 1;

            while(left <= right){
                mid = left + (right - left)/2;

                if(matrix[i][mid] == target)
                    return true;
                
                if(matrix[i][mid] > target)
                    right = mid-1;
                if(matrix[i][mid] < target)
                    left = mid+1;
            }
        }

        return false;
    }
}
