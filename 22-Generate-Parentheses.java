class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
         solve(\\,0, 0 , n , l);
         return l;
    }

    private void solve(String curr, int open, int close, int total, List<String> l){
            if(curr.length() == 2*total){
                l.add(curr);
                return;
            }
            if(open< total){
                solve(curr+'(' , open+1, close, total, l);
            }
            if(close< open){
                solve(curr+')' , open, close+1, total, l);
            }
    }
}