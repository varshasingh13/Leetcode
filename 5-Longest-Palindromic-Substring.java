class Solution {
    int resultLen=0;
    int resultStart=0;
    public String longestPalindrome(String s) {
            int maxLen =0;
            for(int i=0; i< s.length(); i++){
                 expand(s,i,i);
                 expand(s,i,i+1);
                            
                 }
            
            return s.substring(resultStart, resultStart+resultLen);










    //     int max =0, start =0, end =0;
    //     if (s.length()==1){
    //         return s;
    //     }

    //     for(int i=0; i< s.length(); i++){
    //         for(int j=i+1; j< s.length(); j++){
    //             if(checkPalindrom(s.substring(i,j+1))){
    //                 if(max < j-i+1){
    //                  max = j-i+1;
    //                  start = i;
    //                  end = j;
    //                 }

    //             }
    //         }
    //     }
    //     return s.substring(start, end +1);
     }

    // private boolean checkPalindrom(String str){
    //     for(int i=0,j=str.length()-1 ; i<j; i++,j--){
    //         if(str.charAt(i)!=str.charAt(j)){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    private void expand(String s, int left, int right){
        while(left >=0 && right < s.length() && s.charAt(left)==s.charAt(right))  {
            left --;
            right ++;

        }
       if(resultLen <  right - left -1){
            resultStart = left +1;
            resultLen = right - left -1;

       }
       
    }


}