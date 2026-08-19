class Solution {
    public int singleNonDuplicate(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Make mid even
            if (mid % 2 == 1) {
                mid--;
            }

            if (arr[mid] == arr[mid + 1]) {
                // Pair is correct, single is on right
                low = mid + 2;
            } else {
                // Pair is broken, single is on left including mid
                high = mid;
            }
        }

        return arr[low];
    }
}