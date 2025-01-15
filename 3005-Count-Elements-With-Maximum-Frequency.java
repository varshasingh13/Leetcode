class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int highFreq = Integer.MIN_VALUE;
        int ans =0;
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
            highFreq = Math.max(highFreq,freq.get(num));
        }
        for(Map.Entry<Integer,Integer> m: freq.entrySet()){
            if(m.getValue()==highFreq){
                ans = ans + m.getValue();
            }
        }
        return ans;
    }
}