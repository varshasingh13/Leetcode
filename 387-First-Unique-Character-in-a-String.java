class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            // String s1=s.substring(i+1);
            // System.out.println(\sub string- \ + s1 );
            // if(s1.indexOf(s.charAt(i))==-1){
            //     return i;
            // }

            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}