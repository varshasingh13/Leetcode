class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][]  graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dfs(0, ans, temp, graph);
        return ans;

    }

    private void dfs(int node,List<List<Integer>> ans,List<Integer> temp, 
    int[][] graph){
            temp.add(node);
            if(node == graph.length-1){
                ans.add(new ArrayList<>(temp));
            }else{
                for(int n: graph[node]){
                    dfs(n, ans, temp, graph );
                }
               
            }
             temp.remove(temp.size()-1);

    }

}