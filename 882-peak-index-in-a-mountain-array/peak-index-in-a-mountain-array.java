class Solution {
    public int peakIndexInMountainArray(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[mid + 1]) {
                // Ascending side
                low = mid + 1;
            } else {
                // Descending side or peak
                high = mid;
            }
        }

        return low;
    }
}