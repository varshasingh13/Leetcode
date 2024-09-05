class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> m1 = new HashMap<>();
        ArrayList<Integer> l=new ArrayList<>();
        for(int n1:nums1){
            if(m1.containsKey(n1)){
                m1.put(n1, (m1.get(n1) +1));
            }
            else{
                m1.put(n1,1);
            }
        }

        for(int n2:nums2){
            if(m1.containsKey(n2)){
                if(m1.get(n2)>0){
                    l.add(n2);
                    m1.put(n2, (m1.get(n2)-1));
                }

            }
        }

        int res[] = new int[l.size()];
        for(int i=0; i<l.size();i++){
            res[i] = l.get(i);
        }
        return res;

    }
}