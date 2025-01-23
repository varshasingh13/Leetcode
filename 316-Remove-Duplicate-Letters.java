class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        int[] freq = new int[26];
        boolean[] exist = new boolean[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0; i< s.length(); i++){
            char ch2 = s.charAt(i);
            freq[ch2-'a']--;
            if(exist[ch2-'a']){
                continue;
            }
            while(!st.isEmpty() && st.peek() > ch2 && freq[st.peek()-'a']>0){
                char rem = st.pop();
                exist[rem-'a'] = false;

            }
            st.push(ch2);
            exist[ch2 - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
        
    }
}