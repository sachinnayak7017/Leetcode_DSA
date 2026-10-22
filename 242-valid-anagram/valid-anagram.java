class Solution {
      public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        // int[] freq = new int[26];
        // for (int i = 0; i < s.length(); i++) {
        //     freq[s.charAt(i) - 'a']++;
        //     freq[t.charAt(i) - 'a']--;
        // }
        
        // for (int i = 0; i < freq.length; i++) {
        //     if (freq[i] != 0) {
        //         return false;
        //     }
        // }
        
        // return true;
        //second approch 
         HashMap<Character, Integer> map = new HashMap<>();

        char[] arr = s.toCharArray();
      for (char ele : arr) {
            if (map.containsKey(ele)) {
                int count = map.get(ele);
                map.put(ele, ++count);
            } else {
                map.put(ele, 1);
            }
        }
        char[] tarr = t.toCharArray();
         for (char ele : tarr) {
            if (map.containsKey(ele) && map.get(ele) > 0) {
                int count = map.get(ele);
                map.put(ele, --count);
            } else {
                return false;
            }
        }
        return true;
    }

}