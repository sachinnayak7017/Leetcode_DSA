class Solution {
    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            StringBuilder temp = new StringBuilder();

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                if (temp.toString().contains(String.valueOf(ch))) {
                    break;
                }

                temp.append(ch);
                maxLength = Math.max(maxLength, temp.length());
            }
        }

        return maxLength;
    }
}