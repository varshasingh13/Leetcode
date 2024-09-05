class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {


    // APPROACH 1    
    //    for (int i = 0; i<=matrix.length-1; i++) {
    //         for (int j = 0; j < matrix[i].length; j++) {
               
    //             if (matrix[i][j] == target) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;


    //APPROACH 2
    int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int mid_val = matrix[mid / n][mid % n];

            if (mid_val == target)
                return true;
            else if (mid_val < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;




    }
}