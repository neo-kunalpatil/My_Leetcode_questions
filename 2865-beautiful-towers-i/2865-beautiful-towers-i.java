class Solution {
    public long maximumSumOfHeights(int[] maxHeights) {
        int n = maxHeights.length;
        long ans = 0;

        for (int peak = 0; peak < n; peak++) {
            long sum = maxHeights[peak];

            int h = maxHeights[peak];

            for (int i = peak - 1; i >= 0; i--) {
                h = Math.min(h, maxHeights[i]);
                sum += h;
            }

            h = maxHeights[peak];

            for (int i = peak + 1; i < n; i++) {
                h = Math.min(h, maxHeights[i]);
                sum += h;
            }

            ans = Math.max(ans, sum);
        }

        return ans;
    }
}