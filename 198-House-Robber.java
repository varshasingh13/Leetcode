class Solution {
    public int rob(int[] nums) {
        int include = 0;
        int exclude = 0;

        for(int i=0 ;i<nums.length; i++){
            int temp = Math.max(include,exclude);
            include = exclude + nums[i];
            exclude = temp;
        }
        return Math.max(include,exclude);
    }
}