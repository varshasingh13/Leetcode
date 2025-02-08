class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left =0, right = max(nums);
        while(left<right){
            int mid = left + (right - left)/2;
        if(getSum(nums, mid) > threshold){
            left = mid+1;
        }
        else{
            right = mid;
        }
        }
        return left;
    }

     private int getSum(int[] nums,int division){
        int sum = 0;
        for(int num: nums){
       // sum = sum + Math.ceil((double)num/division );
          sum += Math.ceil((double) num / division);
        }
        return sum;
     }

    private int max(int[] nums){
        int maxVal = Integer.MIN_VALUE;
        for(int num: nums){
            maxVal = Math.max(maxVal, num);
        }
        return maxVal;
    }

}