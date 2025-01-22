class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> l = new ArrayList<>();
        int freq2[] = new int[26];


        for(String w2: words2){
            int temp[] = new int[26];
            for(char ch2: w2.toCharArray()){
                temp[ch2-'a']++;
                freq2[ch2-'a'] = Math.max(temp[ch2-'a'], freq2[ch2-'a']);
            }

        }

        for(String w1: words1){
            int temp[] = new int[26];
           
            for(char ch1: w1.toCharArray()){
            temp[ch1-'a']++;
            }
            if(universal(freq2 ,temp )){
                l.add(w1);
            }
           
        }
        return l;
    }

    private boolean universal(int[] freq2 ,int[] temp ){
        for(int i=0; i<26; i++ ){
            if(temp[i] < freq2[i]){
                return false;
            }
        }
        return true;
    }
}