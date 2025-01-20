class Solution {
    public int prefixCount(String[] words, String pref) {
        int count =0;
        int n = pref.length();
       
        for(String word:words){
          
            if(word.length()>=pref.length() && word.substring(0,n).equals(pref)){
                count++;
            }
        }
        return count;
    }
}