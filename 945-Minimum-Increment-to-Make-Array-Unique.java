class Solution {
    public int minIncrementForUnique(int[] nums) {
       Arrays.sort(nums);
       int moves =0;
       for(int i=1; i<nums.length; i++){
        if (nums[i] <= nums[i - 1]) { 
                int increment = nums[i - 1] + 1 - nums[i];
                nums[i] = nums[i - 1] + 1;  // Make it unique
                moves += increment;        // Add to total moves
            }
       } 
       return moves;
    }
}