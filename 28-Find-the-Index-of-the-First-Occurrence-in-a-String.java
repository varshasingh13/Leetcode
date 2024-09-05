class Solution {
    public int strStr(String haystack, String needle) {
        if(needle==\ \ || haystack==\ \){
            return -1;
        }
        return (haystack.indexOf(needle));
    }
}