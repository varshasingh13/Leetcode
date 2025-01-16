class Solution {
    public void sortColors(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ans[] = new int[nums.length];
        int i=0;
        for(int num:nums){
            pq.add(num);
        }
         System.out.println(\pq ->. \+ pq);
        while(!pq.isEmpty()){
            nums[i++] = pq.poll();
        }
        System.out.println(nums);
    }
}