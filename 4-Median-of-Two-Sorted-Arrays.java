class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int merged[] = new int[n1+n2];
        int i=0;
        //double median =0;
        for(int num1:nums1){
            System.out.println(\i1 - \ + i);
            merged[i++] = num1;
        }
        for(int num2:nums2){
             System.out.println(\i2 - \ + i);
            merged[i++] = num2;
        }
        Arrays.sort(merged);
        if((n1+n2)%2==0){
            int mid1 = ((n1+n2)-1)/2;
            int mid2 = (n1+n2)/2;
            System.out.println(\mid1 - \ + merged[mid1]+ \ mid2 - \ + merged[mid2] );
            double median = (merged[mid1] + merged[mid2])/2.0;
            System.out.println(\median even - \ + median);
            return median;
        }
        else if((n1+n2)%2==1){
            double median = merged[i/2];
            System.out.println(\median odd - \ + median);
             return median;
        }
            return 0;
    }
}