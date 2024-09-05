class MinStack {
    // Deque<Integer> st;
    // Deque<Integer> minstack;
    ArrayList<Integer> l;

    public MinStack() {
        // st = new ArrayDeque<Integer>();
        // minstack = new ArrayDeque<Integer>();
        l = new ArrayList<>();
    }
    
    public void push(int val) {
        // st.push(val);
        // if(minstack.isEmpty() || val <= minstack.peek()){
        //     minstack.push(val);
        // }

        l.add(val);
    }
    
    public void pop() {
        
        // if(st.peek().equals(minstack.peek())){
        //     minstack.pop();
        // }
        // st.pop();
        l.remove(l.size()-1);
    }
    
    public int top() {
        // int t = st.peek();
        // return t;
        return l.get(l.size()-1);
    }
    
    public int getMin() {
       
      // return minstack.peek();
        int min = Integer.MAX_VALUE;
      for(int i=0 ; i<l.size(); i++){
        min = Math.min(l.get(i), min);
      }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */