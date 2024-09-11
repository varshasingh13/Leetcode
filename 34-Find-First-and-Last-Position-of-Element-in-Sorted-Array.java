class Solution {
    public int[] searchRange(int[] nums, int target) {
       
        int max = -1;
        int min = -1;
        
         
        for(int i=0; i<=nums.length-1; i++){
            if(nums[i] == target){
                if(min == -1){
                    min =i;
                }
                max = i;
            }
           
        }
        
        return new int[]{min,max};
    }
}