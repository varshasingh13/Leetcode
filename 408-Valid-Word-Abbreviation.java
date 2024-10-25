class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        
        //Take two pointers. 
        int i=0;
        int j=0;
        while(i<word.length() && j<abbr.length()){
            
            if(Character.isDigit(abbr.charAt(j))){
                //check if leading zero
            if(abbr.charAt(j) == '0'){
                return false;
            }
            int num =0;
            while(j<abbr.length() && Character.isDigit(abbr.charAt(j))){
                num = num*10 + (abbr.charAt(j) - '0');
                j++;
            }
            i = i+num;

        }else{
            if(i>=word.length() ||  word.charAt(i)!= abbr.charAt(j)){
                return false;
            }
            i++;
            j++;
        }

        }
        return i == word.length() && j== abbr.length();
    }
}