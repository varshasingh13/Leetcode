class Solution {
    public boolean isPalindrome(String s) {
        String[] st = s.split(\\);
        StringBuilder sb = new StringBuilder();

        for (String st1 : st) {
            char c = st1.charAt(0);
            System.out.println(\c is - \+ c + \  st1 is - \ + st1);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
       String finalString = sb.toString();
        int l = 0, r = finalString.length() - 1;

        while (l < r) {
            if (finalString.charAt(l) != finalString.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}