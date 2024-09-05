class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int plen = p.length();
        ArrayList<Integer> indx = new ArrayList<>();
        
        char pchar[] = p.toCharArray();
        Arrays.sort(pchar);
        int slen = s.length();
        for(int i=0; i<= slen-plen; i++){
            String st = s.substring(i,i+plen);
            char st1[] = st.toCharArray();
            Arrays.sort(st1);
            if(Arrays.equals(pchar, st1)){
                indx.add(i);
            }
            
        }
        return indx;
    }
}