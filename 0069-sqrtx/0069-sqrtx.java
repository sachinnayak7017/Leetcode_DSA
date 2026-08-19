class Solution {
    public int mySqrt(int target) {
        int low = 0;
        int high = target;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((long) mid * mid == target) {
                return mid;
            } else if ((long) mid * mid > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return high;
    }
}