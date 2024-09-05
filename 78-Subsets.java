class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backTrack(nums, 0, temp, ans);
        return ans;

    }

    private void backTrack(int[] nums,int start,List<Integer>  temp,List<List<Integer>> ans){
        ans.add(new ArrayList<>(temp));
        //return;

        for(int i=start; i<nums.length; i++){
            temp.add(nums[i]);
            backTrack(nums, i+1, temp, ans);
            temp.remove(temp.size()-1);
        }
    }

}