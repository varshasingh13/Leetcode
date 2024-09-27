class Solution {
    public int findShortestSubArray(int[] nums) {
        //Arrays.sort(nums);
        int degree=0;
        int c=0;
        HashMap<Integer, Integer> first = new HashMap<>();
         HashMap<Integer, Integer> last = new HashMap<>();
          HashMap<Integer, Integer> count = new HashMap<>();
          int n= nums.length;
          for(int i=0; i<n; i++){

            if(!first.containsKey(nums[i])){
                first.put(nums[i],i);
            }
            last.put(nums[i],i);
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
            degree = Math.max(degree,count.get(nums[i]));
          }
               
            for(int num:count.keySet()){
                if(count.get(num) == degree){
                     n=Math.min(n, last.get(num) - first.get(num) +1);
                }
            }
         return n;
        }
       
    
}