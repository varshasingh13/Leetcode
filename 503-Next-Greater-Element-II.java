class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int ans[] = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(ans, -1);
        for(int i=0; i<2*n; i++){
            int currentIndex = i%n;
            while(!st.isEmpty() && nums[st.peek()]<nums[currentIndex]){
                ans[st.pop()] = nums[currentIndex];
            }
              if (i < n) {
                st.push(currentIndex);
            }
        }
        return ans;
    }
}