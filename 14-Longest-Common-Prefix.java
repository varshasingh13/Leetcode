class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
       String s1= strs[0];
       String s2= strs[strs.length-1];
       StringBuilder sb = new StringBuilder();
       for(int i=0; i<s1.length(); i++)
       {
        if(s1.charAt(i)!=(s2.charAt(i))){
            break;
        }
        sb.append(s1.charAt(i));
       } 
       return sb.toString();
    }
}