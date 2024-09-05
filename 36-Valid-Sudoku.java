class Solution {
    public boolean isValidSudoku(char[][] board) {
        //APPROACH 1
        //validate row
        // for(int row=0; row<9; row++){
        //     Set<Character> s = new HashSet<>();
        //     for(int col=0; col <9 ; col++){
        //         if(board[row][col] == '.'){
        //             continue;
        //         }
        //         if(s.contains(board[row][col])){
        //             return false;
        //         }
        //         s.add(board[row][col]);
        //     }
        // }

        // //Validate col
        // for(int col=0; col<9; col++){
        //     Set<Character> s = new HashSet<>();
        //     for(int row=0; row <9 ; row++){
        //         if(board[row][col] == '.'){
        //             continue;
        //         }
        //         if(s.contains(board[row][col])){
        //             return false;
        //         }
        //         s.add(board[row][col]);
        //     }
        // }

        // //validate each sub-box or matrix of 3*3 .
        // //sr = starting row =0, er = ending row = 0+2 =2
        // //sc = starting col =0, ec = ending col = 0+3 =2
        // for(int sr =0 ;sr <9; sr=sr+3){
        //     int er = sr+2;
        //     for(int sc=0; sc<9; sc=sc+3){
        //      int ec = sc+2;
        //      if(!traverse(board, sr, er, sc, ec)){
        //         return false;
        //      }
        //     }
        // }
        //     return true;

 //----------------------------------------------------------------------

       //APPROACH 2
       //create a stirng for each row , col and box and save in set and check if the 
       //   board[i][j] is coming twice for same row or col or box .For box (3*3), 1/3 and j/3 comes to be same.

       Set<String> s = new HashSet<>();
       for(int i=0; i<9; i++){
        for(int j=0; j<9; j++){
            if(board[i][j] == '.'){
                    continue;
                }
                String dupliRow = board[i][j] + \-ROW-\ + i;
                 String dupliCol = board[i][j] + \-COL-\ + j;
                  String dupliBox = board[i][j] + \-BOX-\ + (i/3) + \-\ + (j/3);
                  if(s.contains(dupliRow) || s.contains(dupliCol) || s.contains(dupliBox)){
                    return false;
                  }
                  s.add(dupliRow);
                   s.add(dupliCol);
                    s.add(dupliBox);
        }
       }    
       return true;



    }

    // public boolean traverse(char[][] board, int sr, int er, int sc, int ec){
    //     Set<Character> s = new HashSet<>();
    //     for(int i=sr; i<= er; i++){
    //         for(int j=sc; j<= ec; j++){
    //             if(board[i][j] == '.'){
    //                 continue;
    //             }
    //             if(s.contains(board[i][j])){
    //                 return false;
    //             }
    //             s.add(board[i][j]);
    //         }
    //     }
    //     return true;
    // }
}