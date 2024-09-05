class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        for(int ast: asteroids){
            boolean flag = false;
            while((!st.isEmpty() && ast<0 && st.peek()>0)){
               // ast = ast * -1;
               // int n=st.pop();
                if(-ast > st.peek()){
                    st.pop();
                    
                }
                else if(-ast == st.peek()){
                    st.pop();
                    flag = true;
                    break;
                }
                else{
                   // st.pop();
                   flag = true;
                   break;
                }
                
            }
            if(!flag){
            st.push(ast);
            }
        }
        int arr[] = new int[st.size()];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        return arr;
    }
}