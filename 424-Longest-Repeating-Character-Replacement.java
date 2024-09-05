class Solution {
    public int characterReplacement(String s, int k) {
        int left =0;
        int right=0;
        int maxFreq = 0;
        int res =0;
        int alphaFreq[] = new int[26];
        while(right < s.length()){
            alphaFreq[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq, alphaFreq[s.charAt(right)-'A']);
            if(right-left+1-maxFreq > k){
                alphaFreq[s.charAt(left)-'A']--;
                left++;
            }
            
            res = Math.max(res, right - left+1);
            right++;

        }
        return res;
    }
}