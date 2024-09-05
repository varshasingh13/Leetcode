class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //List<String> l1 = new ArrayList<>();
       // List<List<String>> lFinal = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);
           
           if(!map.containsKey(sortedStr)){
            map.put(sortedStr, new ArrayList<>());
           }
            map.get(sortedStr).add(s);
            

            //System.out.println(\ans. \ + s1);

        }
        return new ArrayList<>(map.values());
    }
}