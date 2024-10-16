class Solution {
    public int longestConsecutive(int[] nums) {
       //hashset. add all nums
        Set<Integer> numSet = new HashSet<>();
        for(int num: nums){
            numSet.add(num);
        }


        int longest =0;
       //iterate over hashset and check if num-1 is in set 
       //if num-1 is not in set means num is startng point currentnum
       //loop and calculate all current +1 i. hashset and increment the len +1
        for(int num: numSet){
            
            if(!numSet.contains(num-1)){
               int  currentNum = num;
               int  currentLen =1;
            

            while(numSet.contains(currentNum+1)){
                currentNum = currentNum+1;
                currentLen++;
            }

            longest = Math.max(longest,currentLen);
            }
        }

        return longest;
       
    
    }
}