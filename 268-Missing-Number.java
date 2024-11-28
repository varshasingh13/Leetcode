class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int last =0;
        Arrays.sort(nums);
        for(int i=0; i<=n-1; i++){
            if(nums[i] != i){
                return i;
            }
            last = nums[i];
        }
        if(last != n){
            return n;
        }
        return 0;
    }
}