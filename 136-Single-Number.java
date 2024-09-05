class Solution {
    public int singleNumber(int[] nums) {
        // int n=0;
        // for(int num:nums){
        //     n=n^num;
        // }
        // return n;

        ArrayList<Integer> l= new ArrayList<>();
        for(int num:nums){
            if(l.contains(num)){
                l.remove(Integer.valueOf(num));
            }
            else{
                l.add(num);
            }
        }
        return l.get(0);
    }
}