class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len= nums.length;
        int[] res= new int[len];
        int product=1;
        int productWithoutZero=1;
        int zero=0;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==0)
                zero++;
            else
              productWithoutZero=productWithoutZero*nums[i];  
        }
        for(int i=0;i<len;i++)
        {
            product=product*nums[i];
        }
        if(zero>1)
            productWithoutZero=product;
        for(int i=0;i<len;i++)
        {
            res[i]=(nums[i]!=0?product/nums[i]:productWithoutZero);
        }
        return res;
    }
}  
