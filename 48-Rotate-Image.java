class Solution {
    public void rotate(int[][] matrix) {

//approach-1 first transpose the matrix and then swap rows separetly.
//transpose means - swap matrix[i][j] with matrix[j][i]. 
 int n = matrix.length;
for(int i =0; i< n ;i++ ){
    for(int j=i; j<n;j++){
    int temp = matrix[i][j];
    matrix[i][j] =matrix[j][i];
    matrix[j][i] = temp;
    }
}

//swap row means [first row first column] will replace with [first row last col]
// and [first row second col] will replace with [first row secondlast col] and so on so loop runs till n/2

for(int i =0; i< n ;i++ ){
    for(int j=0; j<n/2;j++){
    int temp = matrix[i][j];
    matrix[i][j] =matrix[i][n-j-1];
    matrix[i][n-j-1] = temp;
    }
}





//Approach -2 four way swap

    //      int n = matrix.length;
        
    // for (int i = 0; i < n / 2; i ++) {
    //   for (int j = i; j < n - 1 - i; j ++) {
    //     int temp = matrix[i][j];
    //     matrix[i][j] = matrix[n - 1 -j][i];
    //     matrix[n - 1 -j][i] = matrix[n - 1 -i][n - 1 -j];
    //     matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 -i];
    //     matrix[j][n - 1 -i] = temp;
    //   }
    // }
    }
}