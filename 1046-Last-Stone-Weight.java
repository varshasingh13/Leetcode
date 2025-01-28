class Solution {
    public int longestOnes(int[] nums, int k) {
        int right ,left =0, zeroCount=0;
        int maxLength=Integer.MIN_VALUE;
        for(right =0; right <nums.length; right++){
            if(nums[right]==0){
                zeroCount++;
            }
            while(zeroCount>k){
                if(nums[left]==0){
                zeroCount--;
            }
             left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
        }
       return maxLength;

       
    }
}