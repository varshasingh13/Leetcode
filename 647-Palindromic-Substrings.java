class Solution {
    int res=0;
    public int countSubstrings(String s) {
        for(int i=0; i<s.length();i++){
            expand(s,i,i);
            expand(s,i,i+1);
        }
        return res;
    }

    public void expand(String s, int i , int j){
       // String substr = s.substring(i,j+1);
       // boolean flag= true;
       while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            res++; // Found a palindromic substring
            i--;  // Move left
            j++;  // Move right
        }
        
    }
}