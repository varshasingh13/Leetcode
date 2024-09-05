import java.util.*;
class Solution {

    private int[] orig;
    private Random rand;
    private int[] arr;

    public Solution(int[] nums) {
        this.orig = nums.clone();
        this.arr = nums.clone();
        this.rand = new Random();
    }
    
    public int[] reset() {
        return orig;
    }
    
    public int[] shuffle() {
        
        for(int i = orig.length -1; i>0 ; i--){
            int j = rand.nextInt(i+1);
            swap(arr,i,j);
        }
        return arr;

    }
    public int[] swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */