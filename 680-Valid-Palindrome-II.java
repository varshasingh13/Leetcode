class Solution {
    public boolean validPalindrome(String s) {

        //APPROACH 1 
        // if(!checkPalindrome(s)){
        //     for(int i=0 ; i<s.length(); i++){
        //         StringBuilder sb = new StringBuilder(s);
        //         String newStr = sb.deleteCharAt(i).toString();
        //         if(checkPalindrome(newStr)){
        //             return true;
        //         }
        //     }
        //     return false;
        // }
        // else {
        //     return true;
        // }
        

        //APPROACH 2 
        int  left =0, right =  s.length()-1;
        while(left < right){
            if(s.charAt(left)!= s.charAt(right)){
                return checkPalindrome(s,left+1, right) || checkPalindrome(s,left, right-1);
            }
            left ++;
            right--;
        }

    return true;

    }

    public boolean checkPalindrome(String s, int left, int right){
        String str = s.substring(left , right+1);
        for(int i=0, j= str.length()-1; i<j; i++,j--){
            if(str.charAt(i)!= str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}