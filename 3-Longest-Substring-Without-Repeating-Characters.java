class Solution {
    public int lengthOfLongestSubstring(String s) {
                if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character has been seen before and is within the current window, move the left pointer
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= left) {
                left = charIndexMap.get(currentChar) + 1;
            }

            // Update the last seen index of the current character
            charIndexMap.put(currentChar, right);

            // Calculate the length of the current window
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}