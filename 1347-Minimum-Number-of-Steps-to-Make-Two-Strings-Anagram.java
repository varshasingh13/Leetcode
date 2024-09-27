class Solution {
    public int minSteps(String s, String t) {
      int[] ch = new int[26];
      int count=0;
      for(char chs:s.toCharArray()){
        ch[chs - 'a']++;
      }
      for(char cht:t.toCharArray()){
        ch[cht - 'a']--;
      }

      for(int i=0; i< ch.length; i++){
        if(ch[i]>0){
            count = count+ch[i];
        }
      }
      return count;

    }
}