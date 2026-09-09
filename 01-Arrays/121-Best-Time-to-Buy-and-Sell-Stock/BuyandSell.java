public class BuyandSell {
     public int maxProfit(int[] prices){
        int n = prices.length;
        // Stores the minimum stock price seen so far

        int minprice = Integer.MAX_VALUE;
         // Stores the maximum profit
        int maxprofit = 0;
   // Traverse through all stock prices
        for(int i = 0 ; i < n ; i++){
            if(minprice > prices[i]){
                minprice = prices[i];
            }else{
                    // Update maximum profit
                maxprofit = Math.max(maxprofit, prices[i] - minprice);
            }
        }

        return maxprofit;
     }
}
