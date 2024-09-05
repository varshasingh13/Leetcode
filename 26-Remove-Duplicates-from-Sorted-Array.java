class Solution {
    public int removeDuplicates(int[] nums) {
        int count =0;
        int len = nums.length;
        System.out.println(\length   \+ nums.length);
        for(int i=0;i<len-1;i++){
            if(nums[i]!=nums[i+1]){
            //System.out.println(\nums   \+ nums[i]);
            nums[count]=nums[i];
           // System.out.println(\nums count  \+ nums[count]);
            count++;
            }
           
        }
        nums[count] = nums[len - 1];
       
        return count+1;
    }
}