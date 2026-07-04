class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int sell=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<sell){
                sell=prices[i];
            }
            maxProfit=Math.max(maxProfit,prices[i]-sell);
        }
        return maxProfit;
        
    }
}
