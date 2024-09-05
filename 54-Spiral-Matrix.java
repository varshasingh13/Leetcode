class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       int sr = 0;
       int er = matrix.length-1;
       int sc = 0;
       int ec = matrix[0].length-1;
       List<Integer> l = new ArrayList<>();

        if (matrix.length == 0) {
         return l;
            }

        while(sr<=er && sc<=ec){
            //traverse right
            for(int i = sc; i<= ec; i++){
                l.add(matrix[sr][i]);
            }
            sr++;

            //traverse down
            for(int i=sr; i<=er; i++){
                l.add(matrix[i][ec]);
            }
            ec--;

            //traverse left
              if (sr <= er) {
            for(int i = ec; i>= sc; i--){
                l.add(matrix[er][i]);
            }
              }
            er--;

            //traverse  up
              if (sc <= ec) {
             for(int i = er; i>=sr ; i--){
                l.add(matrix[i][sc]);
            }
              }
            sc++;

        }
            return l;
    }
}