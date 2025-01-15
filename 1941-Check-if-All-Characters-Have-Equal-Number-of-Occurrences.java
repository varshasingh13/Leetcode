class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> m = new HashMap<>();
        for(char ch: s.toCharArray()){
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        int first=0;
        for(int val:m.values()){
            if(first ==0){
                first =val;
            }
            if(first!=val){
                return false;
            }
        }
            return true;
    }
}