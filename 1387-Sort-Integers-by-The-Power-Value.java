class Solution {
    public int getKth(int lo, int hi, int k) {
        List<int[]> stepCountList = new ArrayList<>();
        
        for(int i=lo; i<=hi;i++){
            int val = i;
            int stepcount=0;
            while(val!=1){
                if(val%2==0){
                    val = val/2;
                }
                else{
                    val = 3*val+1;
                }
               
                stepcount++;
            }
             
            stepCountList.add(new int[]{i,stepcount});
        }
        Collections.sort(stepCountList,(a,b)->Integer.compare(a[1],b[1]));
        return stepCountList.get(k-1)[0];
    }
}