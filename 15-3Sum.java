class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> unique = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<=nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
            if(nums[i] + nums[left] + nums[right] ==0){
                unique.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;
            }
            else if(nums[i] + nums[left] + nums[right]>0){
                right--;
            }
            else{
                left++;
            }
            }
        
        }
        ans.addAll(unique);
        return ans;

    }
}