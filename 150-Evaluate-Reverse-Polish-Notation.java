class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int res;
        for(String t: tokens){
            if(t.equals(\+\)){
                int a = s.pop();
                int b = s.pop();
                res = a+b;
                 s.push(res);
            }
            else if(t.equals(\-\)){
                int second = s.pop();
                int first = s.pop();
                res = first-second;
                 s.push(res);
            }
            else if(t.equals(\*\)){
                int a = s.pop();
                int b = s.pop();
                res = a*b;
                 s.push(res);
            }
            else if(t.equals(\/\)){
                int second = s.pop();
                int first = s.pop();
                res = first/second;
                 s.push(res);
            }
            else{
                s.push(Integer.parseInt(t));
            }
           
        }
        return s.peek();
    }
}