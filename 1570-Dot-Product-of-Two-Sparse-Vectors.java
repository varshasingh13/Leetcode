class SparseVector {
    int[] nums;
    SparseVector(int[] nums) {
        this.nums = nums;
    }
    
	// Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int sum =0;
        if(this.nums.length != vec.nums.length){
            return -1;
        }
        else{
            
            for(int i=0; i<this.nums.length; i++){
                sum = sum + (this.nums[i]*vec.nums[i]);
            }
        }
        return sum;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);