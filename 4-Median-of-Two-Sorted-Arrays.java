class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
           int n1 = nums1.length;
        int n2 = nums2.length;
        int merged[] = new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;
        //APPROACH 1
        while(i<n1 && j<n2){
                if(nums1[i] > nums2[j]){
                    merged[k++] = nums2[j++];
                }
                else{
                    merged[k++] = nums1[i++];
                }
        }

        while(i<n1){
             merged[k++] = nums1[i++];
        }
          while(j<n2){
             merged[k++] = nums2[j++];
        }
        int size = n1+n2;
        if(size%2==1){
            return merged[size/2];
        }
        else if(size%2==0){
            return (merged[size/2] + merged[(size/2)-1])/2.0;
        }




        //APPROACH 2 
        // //double median =0;
        // for(int num1:nums1){
        //    // System.out.println(\\i1 - \\ + i);
        //     merged[i++] = num1;
        // }
        // for(int num2:nums2){
        //     // System.out.println(\\i2 - \\ + i);
        //     merged[i++] = num2;
        // }
        // //worst aproach as sorting again takes (m+n) complexity
        // Arrays.sort(merged);
        // if((n1+n2)%2==0){
        //     int mid1 = ((n1+n2)-1)/2;
        //     int mid2 = (n1+n2)/2;
           
        //     double median = (merged[mid1] + merged[mid2])/2.0;
            
        //     return median;
        // }
        // else if((n1+n2)%2==1){
        //     double median = merged[i/2];
            
        //      return median;
        // }
            return 0;
    }
}