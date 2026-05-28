class Solution {
    public int maxProfit(int[] prices) {
        int res= 0;
        int len= prices.length;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
               res= Math.max(res,prices[j]-prices[i]);
            }
        }
        return res;
    }
}
