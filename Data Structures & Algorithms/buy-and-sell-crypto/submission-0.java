class Solution {
    public int maxProfit(int[] prices) {
        int[] maxProfit = new int[prices.length];
        for(int i=0;i<prices.length;i++){
            for(int j=0;j<i;j++){
                int profit = prices[i] - prices[j];
                if(maxProfit[j]<profit){
                    maxProfit[j] = profit;
                }
            }
        }
        int max = java.util.Arrays.stream(maxProfit).max().getAsInt();
        return Math.max(max,0);
    }
}
