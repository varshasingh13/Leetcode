class Solution {
    public String mergeAlternately(String word1, String word2) {
        int[] strCh = new int[word1.length() + word2.length()];
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i=0, j=0;
        while(i<w1.length &&  j<w2.length){
            sb.append(w1[i]);
            i++;
            sb.append(w2[j]);
            j++;
        }
        while(i<w1.length){
            sb.append(w1[i]);
            i++;
        }
        while(j<w2.length){
            sb.append(w2[j]);
            j++;
        }

       return sb.toString();
    }
}