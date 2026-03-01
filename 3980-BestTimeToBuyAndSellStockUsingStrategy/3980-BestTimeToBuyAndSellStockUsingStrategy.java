// Last updated: 01/03/2026, 22:30:39
class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;

       
        long originalProfit = 0;
        for (int i = 0; i < n; i++) {
            originalProfit += (long) strategy[i] * prices[i];
        }

        
        long[] prefixPrices = new long[n + 1];
        long[] prefixContrib = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefixPrices[i + 1] = prefixPrices[i] + prices[i];
            prefixContrib[i + 1] = prefixContrib[i] + (long) strategy[i] * prices[i];
        }

        long bestDelta = 0;
        for (int i = 0; i + k <= n; i++) {
            long oldSum = prefixContrib[i + k] - prefixContrib[i];
            long newSum = prefixPrices[i + k] - prefixPrices[i + k / 2];
            long delta = newSum - oldSum;
            if (delta > bestDelta) {
                bestDelta = delta;
            }
        }

        return originalProfit + bestDelta;
    }
}
