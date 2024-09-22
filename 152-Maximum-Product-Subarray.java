class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        // int maxProduct = nums[0];
        // int minProduct = nums[0];
        // int result = nums[0];
        int pre =1;
        int suff =1;
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            //Approach 1
            if(pre == 0)
            pre =1;

            if(suff == 0)
            suff =1;

            pre = pre *nums[i];
            suff = suff*nums[nums.length-i-1];
            result = Math.max(result, Math.max(pre,suff));


            //Approach -2
            // if (nums[i] < 0) {
            //     // Swap maxProduct and minProduct when nums[i] is negative
            //     int temp = maxProduct;
            //     maxProduct = minProduct;
            //     minProduct = temp;
            // }

            // // Update maxProduct and minProduct
            // maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            // minProduct = Math.min(nums[i], minProduct * nums[i]);

            // // Update the result
            // result = Math.max(result, maxProduct);

        }

        return result;
    }
}