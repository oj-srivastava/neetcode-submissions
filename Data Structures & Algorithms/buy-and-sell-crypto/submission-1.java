class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i;j<prices.length;j++){
                if(prices[j]-prices[i]>maxprofit){
                    maxprofit=prices[j]-prices[i];
                }
            }
        }
        return maxprofit;
    }
}
