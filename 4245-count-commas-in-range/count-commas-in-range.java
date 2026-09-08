class Solution {
    public int countCommas(int n) {
        int ans = 0;

        long start = 1000; // first number having 1 comma
        int commas = 1;

        while (start <= n) {
            long end = start * 1000 - 1;

            long countNumbers = Math.min((long)n, end) - start + 1;

            ans += countNumbers * commas;

            start *= 1000;
            commas++;
        }

        return ans;
    }
}