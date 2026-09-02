class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd = 0, even = 0;

        for (int num : nums1) {
            if ((num & 1) == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // Possible if all numbers already have same parity
        // OR there is at least one odd and one even number
        return odd == 0 || even == 0 || (odd > 0 && even > 0);
    }
}