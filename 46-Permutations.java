class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> ans = new ArrayList<>();
        if(nums.length == 1){
            // ans.add(new ArrayList<>()); // Add the empty subset
            // ans.add(new ArrayList<>(Arrays.asList(nums[0])));

            ans.add(new ArrayList<>(Arrays.asList(nums[0])));
            return ans;
        }
        List<Integer> temp = new ArrayList<>();
       
        backTrack(nums, temp, ans);
        return ans;
    }

    private void backTrack(int[] nums, List<Integer> temp, List<List<Integer>> ans){

        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0; i<nums.length; i++){

            if(temp.contains(nums[i])){
                continue;
            }
            temp.add(nums[i]);
            backTrack(nums, temp, ans);
           // temp.remove(temp.size()-2);
            temp.remove(temp.size()-1);
        }
    }
}