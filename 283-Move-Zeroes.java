class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
                if(nums[i] !=0){
                    nums[k] = nums[i];
                    k++;
                }
        }

        for(;k<len;k++){
            nums[k]=0;
        }
        
    }
}