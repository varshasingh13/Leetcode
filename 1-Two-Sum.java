class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //             if(nums[i]+nums[j]==target){
        //                return new int[]{i, j};
        //             }
        //     }
        // }
        // return null;


        Map<Integer,Integer> m = new HashMap<>();
        int res[]=new int[2];
        for(int i=0; i <nums.length; i++){
            if(m.containsKey(target-nums[i])){
                res[0] = m.get(target-nums[i]);
                res[1] = i;
                return res;
            }
            else{
                m.put(nums[i],i);
            }
        }
        return null;
    }
}