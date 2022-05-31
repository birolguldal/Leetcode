class Solution {
    public int maxProfit(int[] prices) {
        
        //for loop 
        //bir gun ve bir sonraki gun arasindaki fark ile cevabi bulabiliriz
        
        int profit = 0;
        
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1]) { 
                profit += prices[i] - prices[i-1];
                
            }
        }
        return profit; 
    }
}