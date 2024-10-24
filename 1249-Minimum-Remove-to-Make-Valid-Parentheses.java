class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();
        
        // First pass: Mark invalid parentheses
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(') {
                stack.push(i);  // Store the index of '('
            } else if (sb.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();  // Match found, pop the corresponding '('
                } else {
                    sb.setCharAt(i, '*');  // Invalid ')', mark it
                }
            }
        }
        
        // Mark remaining unmatched '(' in the stack
        while (!stack.isEmpty()) {
            sb.setCharAt(stack.pop(), '*');
        }
        
        // Second pass: Build the valid string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '*') {
                result.append(sb.charAt(i));
            }
        }
        
        return result.toString();
    }
}
