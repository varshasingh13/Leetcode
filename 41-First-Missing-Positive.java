class Solution {
    public int firstMissingPositive(int[] nums) {
        // Arrays.sort(nums); 
        // List<Integer> l = new ArrayList<>();
         HashSet<Integer> s = new HashSet<>();
        for (int num : nums) {
            s.add(num);
            
        }
        int missingValue =1;
        while(missingValue<=nums.length){
            if(!s.contains(missingValue)){
                return missingValue;
                
            }
           missingValue++;
        }
        return missingValue;
    }
}