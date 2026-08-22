class Solution {
    public int maximumGap(int[] nums) {

        if (nums.length < 2)
            return 0;

        int n = nums.length;

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if (min == max)
            return 0;

        int bucketSize = (int) Math.ceil((double) (max - min) / (n - 1));
        int bucketCount = (max - min) / bucketSize + 1;

        int[] minBucket = new int[bucketCount];
        int[] maxBucket = new int[bucketCount];
        boolean[] bucketUsed = new boolean[bucketCount];

        Arrays.fill(minBucket, Integer.MAX_VALUE);
        Arrays.fill(maxBucket, Integer.MIN_VALUE);

        for (int num : nums) {

            int index = (num - min) / bucketSize;

            minBucket[index] = Math.min(minBucket[index], num);
            maxBucket[index] = Math.max(maxBucket[index], num);
            bucketUsed[index] = true;
        }

        int maxGap = 0;
        int prevMax = maxBucket[0];

        for (int i = 1; i < bucketCount; i++) {

            if (!bucketUsed[i])
                continue;

            maxGap = Math.max(maxGap, minBucket[i] - prevMax);
            prevMax = maxBucket[i];
        }

        return maxGap;
    }
}