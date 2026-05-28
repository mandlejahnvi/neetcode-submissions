class Solution {
    public int maxProfit(int[] prices) {
        int res= 0;
        int len= prices.length;
        int left=0, right=1;
        while(left<=right && right<len)
        {
            if(prices[left]>prices[right])
            {
                left=right;
                right++;
            }
            else{
                res=Math.max(res, prices[right]-prices[left]);
                right++;
            }
        }
        return res;
    }
}
