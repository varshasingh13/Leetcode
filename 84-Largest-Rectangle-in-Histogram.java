class Solution {
    public int largestRectangleArea(int[] heights) {
        int ps[] = prevSmaller(heights);
        int ns[] = nextSmaller(heights);
        int max =0;
        for(int i=0; i<heights.length; i++){
            max = Math.max(max,(ns[i]-ps[i]-1)*heights[i]);
        }
        return max;
    }
    private int[] prevSmaller(int[] heights){
        Stack<Integer> st = new Stack<>();
        int ps[] = new int[heights.length];
        for(int i=0; i<heights.length; i++){
            while(!st.isEmpty() && heights[i] <= heights[st.peek()] ){
                st.pop();
            }
            if(st.isEmpty()){
                ps[i] = -1;
            
            }
            else {
                ps[i] = st.peek();
            }
            st.push(i);
        }
        return ps;
    }

    private int[] nextSmaller(int[] heights){
        Stack<Integer> st = new Stack<>();
        int ns[] = new int[heights.length];
        for(int i=heights.length-1; i>=0; i--){
            while(!st.isEmpty() && heights[i] <= heights[st.peek()] ){
                st.pop();
            }
            if(st.isEmpty()){
                ns[i] =heights.length ;
            
            }
            else {
                ns[i] = st.peek();
            }
            st.push(i);
        }
        return ns;
    }
}