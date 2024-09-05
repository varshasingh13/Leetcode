class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int count =0;
        int val[] = new int[matrix.length * matrix.length];
        //System.out.println(\matrix size - \ + matrix.length);
        for(int row = 0; row<matrix.length; row++){
            for(int col=0; col<matrix[row].length; col++){
                val[count++] = matrix[row][col];
            }
        }
        Arrays.sort(val);

        return val[k-1];
    }
}