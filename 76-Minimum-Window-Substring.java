class Solution {
    public String minWindow(String s, String t) {
        int arr[] = new int[128];
        String ans = \\;
        if(t.length() > s.length()){
            return ans;
        }
        char[] tcharArr = t.toCharArray();
        char[] scharArr = s.toCharArray();
        for(char tchar: tcharArr){
            arr[tchar]++;
        }
        int l=0,r=0;
        int min =Integer.MAX_VALUE;
        int find=t.length();
        int found = 0;
        
        while(r< s.length()){
            arr[scharArr[r]]--;
            if(arr[scharArr[r]]>=0){
                found++;
            }

            while(find == found){
                if(min > r-l+1){
                    min = r-l+1;
                    ans = s.substring(l,r+1);
                }
               // min = Math.min(min, r-l+1);
                
                
                arr[scharArr[l]]++;
                if(arr[scharArr[l]]>0){
                    found--;
                }
                l++;
            }

            r++;

        }
        return ans;

    }
}