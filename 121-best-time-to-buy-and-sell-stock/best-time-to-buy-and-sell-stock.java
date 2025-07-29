class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int present=prices[0];
        for(int i=0;i<prices.length;i++){
            int current=prices[i];
            if(present>current){
                present=current;
            }
            else if((current-present)>profit){
                profit=current-present;
            }
        }
        return profit;
        
    }
}