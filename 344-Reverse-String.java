class Solution {
    public void reverseString(char[] s) {
        
        String s1=new String(s);
        s1 = new StringBuilder(s1).reverse().toString();
        System.out.println(\s1===\ + s1);
        for(int i=0; i<s.length; i++){
            s[i] = s1.charAt(i); 
        }

     

    }
}