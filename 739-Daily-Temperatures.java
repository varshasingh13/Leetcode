class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[temperatures.length];
        for(int i=0; i< n; i++ ){
            while(!st.isEmpty() && temperatures[i]> temperatures[st.peek()])
            {
                int idx = st.pop();
                ans[idx] = i-idx;
            }
            st.push(i);
        }
        return ans;


        // int ans[] = new int[temperatures.length];
        // for(int i =0; i<temperatures.length; i++ ){
        //     for(int j=i+1; j<temperatures.length; j++){
        //         if(temperatures[j]> temperatures[i]){
        //             ans[i] = j-i;
        //             break;
        //         }
        //     }
        // }
        // return ans;
    }
}