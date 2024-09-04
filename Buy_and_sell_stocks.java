public class Buy_and_sell_stocks {
    //Solution Starts here
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0; // Not enough prices to make a profit
        }
        int small=Integer.MAX_VALUE;
        int s_idx=-1;
        int diff=0;
        int l_idx=0;
        int max_profit=0;
        for(int i=0;i<prices.length;i++){

            if(prices[i]<small){
                small=prices[i];
                s_idx=i;

            }

            if ((prices[i]-prices[s_idx])>max_profit){
                max_profit=prices[i]-prices[s_idx];
                l_idx=i;
            }

        }


        return max_profit;
    }
    //Solution Ends Here
}
