class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;;
        List<Integer> l = new ArrayList<>();
        List<List<Integer>> l1 = new ArrayList<>();
        for(int i=1; i<arr.length; i++){
            int diff = arr[i] - arr[i-1];
            if(minDiff>diff){
                l1.clear();
                minDiff = diff;
                //l1.add(Arrays.asList(arr[i-1],arr[i]));
            }
            if(minDiff == diff ){
                l1.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return l1;

    }
}