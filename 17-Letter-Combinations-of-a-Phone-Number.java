class Solution {
    public List<String> letterCombinations(String digits) {
       List<String> ans = new ArrayList<>();

        if(digits == null || digits.length() ==0){
            return ans;
        }

       backTrack(0,new StringBuilder(), digits, ans, \\);
       return ans;
    }

    private void backTrack(int start, StringBuilder sb, String digits,         List<String> ans,String stringFromDigit ){
        if(start == digits.length()){
            ans.add(sb.toString());
            return;
        }
        //if(ans)
         stringFromDigit = getStringofDigit(digits.charAt(start));
        for(char ch : stringFromDigit.toCharArray() ){
            sb.append(ch);
            backTrack(start+1, sb, digits, ans, stringFromDigit);
            sb.deleteCharAt(sb.length()-1);
        }


    }

    private String getStringofDigit(char singleDig){
       String s = new String();
        switch(singleDig){
            case '2': s = \abc\;
            break;
            case '3': s = \def\;
            break;
            case '4': s = \ghi\;
            break;
            case '5': s = \jkl\;
            break;
            case '6': s = \mno\;
            break;
            case '7': s = \pqrs\;
            break;
             case '8': s = \tuv\;
            break;
            case '9': s = \wyxz\;
            break;
        }
        return s;
    }
}