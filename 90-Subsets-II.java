class Solution {
     public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
         Arrays.sort(nums); 
        backTrack(ans, 0, nums, temp);
        return ans;
    }

    private void backTrack(List<List<Integer>> ans, int start, int[] nums, List<Integer> temp){
        if(!ans.contains(temp)){
           ans.add(new ArrayList<>(temp));
        }
        
        for(int i=start; i<nums.length; i++){
            // if(i> start && nums[i] == nums[i-1]){
            //     continue;
            // }
            temp.add(nums[i]);
            backTrack(ans, i+1, nums, temp);
            temp.remove(temp.size() - 1);
        }
    }
}