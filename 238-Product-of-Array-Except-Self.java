class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int ans[] = new int[nums.length];
        // for(int i =0; i< nums.length; i++){
        //       int mul =1;
        //     for(int j=0; j< nums.length ; j++){
        //         if(i!=j){
        //             mul = mul * nums[j];
        //         }
        //     }
        //     ans[i] = mul;
        // }
        // return ans;

        //APPROACH 2
        // int n = nums.length;
        // int pre[] = new int[n];
        // int suff[] = new int[n];
        // pre[0] = 1;
        // suff[n-1] =1;
        // for(int i =1 ;i< n ; i++){
        //     pre[i] = pre[i-1] * nums[i-1];
        // }
        // for(int i =n-2 ;i>=0 ; i--){
        //     suff[i] = suff[i+1] * nums[i+1];
        // }
        // int ans[] = new int[n];
        // for(int i=0; i< n;i++){
        //     ans[i] = pre[i]* suff[i];
        // }
        // return ans;

        //APPROACH 3
        int n = nums.length;
        int ans[] = new int[n];
        ans[0] =1;
        for(int i =1 ;i< n ; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        int right =1;
        for(int i =n-1 ;i>=0 ; i--){
            ans[i] = ans[i] * right;
            right = right * nums[i];
        }
        return ans;
    }
}