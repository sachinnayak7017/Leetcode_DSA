class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;
        int maxnumber = nums[n];
        int totalcount =0;
         for(int i =0; i < n;i++){
            totalcount += maxnumber - nums[i];
         }
return totalcount;
    }
}