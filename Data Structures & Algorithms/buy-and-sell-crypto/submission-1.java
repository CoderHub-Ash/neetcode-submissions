class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int profit = 0;

        for(int price: prices)
        {
            profit = Math.max(profit, price-min_price);
            min_price = Math.min(min_price, price);
        }

        return profit;
    }
}
