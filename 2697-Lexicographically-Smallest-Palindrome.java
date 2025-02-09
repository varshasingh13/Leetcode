class Solution {
    public String makeSmallestPalindrome(String s) {
         char[] arr = s.toCharArray();
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (arr[i] != arr[j]) {
                // Replace the larger character with the smaller one
                arr[i] = arr[j] = (char) Math.min(arr[i], arr[j]);
            }
            i++;
            j--;
        }

        return new String(arr);
    }
}