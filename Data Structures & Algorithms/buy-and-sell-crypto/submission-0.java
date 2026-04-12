class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0; i < prices.length; i++) {
            for(int j = i+1; j < prices.length; j++) {
                int value = prices[j] - prices[i];
                if(value > profit) {
                    profit = value;
                }
            }
        }
        /*
        while(i < j) {

        }*/
        return profit;
    }
}
