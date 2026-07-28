class Solution {
    public int maxProfit(int[] prices) {
        // int min_price = prices[0];
        // int max_profit = 0;
        // for (int i = 1; i < prices.length; i++) {
        //     min_price = Math.min(min_price, prices[i]);
        //     max_profit = Math.max(max_profit, prices[i] - min_price);
        // }
        // return max_profit;

        int min_p =  prices[0];
        int max_p = 0;
        for(int i = 1; i < prices.length; i++)
        {
            min_p = Math.min(min_p,prices[i]);
            max_p = Math.max(max_p,prices[i] - min_p);
        }
        return max_p;
    }
}
