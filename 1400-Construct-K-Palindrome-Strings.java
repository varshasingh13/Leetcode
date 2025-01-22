class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k){
            return false;
        }
        Map<Character,Integer> m= new HashMap<>();
        for(char ch: s.toCharArray()){
            m.put(ch, m.getOrDefault(ch,0)+1);
        }
        int oddCount=0;
        for(int freq : m.values()){
            if(freq%2==1){
                oddCount++;
            }
        }
        return oddCount<=k;
    }
}