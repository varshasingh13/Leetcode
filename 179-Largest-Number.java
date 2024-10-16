class Solution {
    public String largestNumber(int[] nums) {
         //convert num into string
        String[] numArr = new String[nums.length];
        for(int i=0; i<nums.length; i++ ){
            numArr[i] = String.valueOf(nums[i]);
        }

        // array sort with custom logic
        Arrays.sort(numArr, (a,b)->(b+a).compareTo(a+b));

        //check if largest is 0
        if(numArr[0].equals(\0\)){
            return \0\;
        }

        //StringBuilder 
        StringBuilder sb = new StringBuilder();
        for(String s: numArr){
            sb.append(s);
        }
        return sb.toString();
    }
}