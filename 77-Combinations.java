class Solution {
    
        List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp = new ArrayList<>();
        backTrace(temp, n, k, 1);
        return ans;
    }

    private void backTrace(List<Integer> temp,int n,int k, int num){
        if(temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=num;i<=n;i++ ){
            temp.add(i);
            backTrace(temp, n, k, i+1);
            temp.remove(temp.size()-1);
        }
    }
    
}