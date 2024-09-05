class Solution {
    public int trap(int[] height) {
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        left[0] =  height[0];
        right[height.length-1] = height[height.length-1];
        //left size
        for(int i=1; i<height.length; i++){
            left[i] = Math.max(height[i], left[i-1] );
        }

        //right height
        for(int i=height.length-2; i>=0; i--){
            right[i] = Math.max(height[i],right[i+1] );
        }
        //compare at all index left and right height and find min
        int ans =0;
        for(int i=0; i< height.length; i++){
            ans = ans + (Math.min(left[i],right[i]) - height[i]);
        }
        return ans;
    }
}