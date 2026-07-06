class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int maxPro = 0;
        for(int i  = 0;  i < len-1; i++){
            int currMax = 0;
            for(int j = i+1; j < len; j++){
                maxPro = Math.max(maxPro, prices[j] - prices[i]);
            }
            // maxPro = Math.max(maxPro,currMax);
        }
        return maxPro;
    }
}
