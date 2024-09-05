class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char mCh[] = magazine.toCharArray();
        char rCh[] = ransomNote.toCharArray();
       int ch[] = new int[26];
       for(char m : mCh){
        ch[m - 'a']++;

       }
       for(char r: rCh){
        ch[r - 'a']--;
         if(ch[r - 'a'] <0 )
        return false;
       }
       
         return true;

    }
}