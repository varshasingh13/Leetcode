class Solution {
    public int leastInterval(char[] tasks, int n) {
        //put all element in freq map and find max count
        Map<Character, Integer> freqMap = new HashMap<>();
        int maxCount=0;
        for(char task:tasks){
            freqMap.put(task, freqMap.getOrDefault(task,0)+1);
            maxCount = Math.max(maxCount, freqMap.get(task));
        }

        // count no. of char with same max count
        int charMaxCount=0;
            for(int count:freqMap.values()){
                if(count == maxCount){
                        charMaxCount++;
                }
            }


        //calculate the min. no of interval
        int chunk = (maxCount-1) * (n+1) + charMaxCount;

        return Math.max(chunk, tasks.length);
    }
}