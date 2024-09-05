class Solution {
    public int nthUglyNumber(int n) {

        int arr[] = new int[n];
        int twoPointer =0;
        int threePointer =0;
        int fivePointer =0;
        arr[0] = 1;
        for(int i=1; i<arr.length; i++){
            arr[i] = Math.min(2*arr[twoPointer], Math.min(3*arr[threePointer] , 5*arr[fivePointer]));
            if(arr[i] == arr[twoPointer]*2){
                twoPointer++;
            }
            if(arr[i] == arr[threePointer]*3){
                threePointer++;
            }
            if(arr[i] == arr[fivePointer]*5){
                fivePointer++;
            }
        }
        
        return arr[n-1];







        // int count =0;
        // int last =0;
        // for(int i=1; count<=n; i++){
        //     int num = i;
        //     if(num==1){
                
        //         count++;
        //         System.out.println(\ i1 = \+ num + \count1 = \ + count);
        //     }
        //     while(num%2==0){
        //         num = num/2;
        //     }
        //      while(num%3==0){
        //         num = num/3;
        //     }
        //      while(num%5==0){
        //         num = num/5;
        //     }
        //     if (num == 1) {
        //         count++;
        //         last = i;  
        //     }
        // }
        // return last;





    }
}