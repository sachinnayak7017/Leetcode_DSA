class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
     int row = arr.length, cols = arr[0].length;
       int low = 0, high = row*cols-1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midrow  = mid/cols, midCol = mid % cols;
            if (arr[midrow][midCol] == target) return true;
            else if(arr[midrow][midCol]>target) high = mid-1;
            else low = mid +1;
    }
    return false;




    }
}