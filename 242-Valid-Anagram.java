class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] chs=s.toCharArray();
        char[] cht=t.toCharArray();
        Arrays.sort(chs);
        Arrays.sort(cht);
        
        return new String(chs).equals(new String(cht));
      
    }
}