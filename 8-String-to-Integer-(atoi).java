class Solution {
    public int myAtoi(String s) {
        String s1 = s.trim();
        if (s1.length() == 0) return 0;
        System.out.println(\s1 valueee-\ + s1);
        int n = 0;
        int sign = 1;
        int i = 0;
        int len = s1.length();
        StringBuilder sb = new StringBuilder();

        // Handle the sign if present
        if (s1.charAt(i) == '+' || s1.charAt(i) == '-') {
            sign = s1.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        // Traverse the string and build the number
        while (i < len) {
            char c = s1.charAt(i);
            if (!Character.isDigit(c)) break;

            sb.append(c);
            i++;
        }

        // If no digits were found
        if (sb.length() == 0) return 0;

        // Parse the integer
        try {
            n = Integer.parseInt(sb.toString()) * sign;
        } catch (NumberFormatException e) {
            // Handle overflow cases
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return n;
        
    }
}