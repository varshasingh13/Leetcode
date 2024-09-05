class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int number =0;
        int sign =1;
        int res =0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                number = number*10 + (ch-'0');
            }
            if(ch=='+' || ch=='-'){
                res = res+(number*sign);
                sign = (ch=='-')?-1:1;
                number =0;
            }
            if(ch=='('){
                st.push(res);
                st.push(sign);
                number =0;
                res =0;
                sign =1;
            }
            if(ch==')'){
                res = res+(number*sign);
                number =0;
                res = res * st.pop();
                res = res + st.pop();
            }
        }
        return res+(number*sign);
    }
}