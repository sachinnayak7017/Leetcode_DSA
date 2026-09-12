class Solution {
    public static int strStr(String haystack, String needle) {
         int idx =-1;
         if(haystack.length()<needle.length()) return idx;
        for (int i = 0;i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
               if(haystack.substring(i,needle.length()+i).equals(needle)){
                   return i;
                   
               }
            }
        }

        return idx;
    }
}