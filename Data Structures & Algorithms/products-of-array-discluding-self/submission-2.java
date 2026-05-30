class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len= nums.length;
        int[] res= new int[len];
        int prefix=nums[0], sufix=nums[len-1];
        res[0]=1;
        for(int i=1;i<len;i++)
        {
            res[i]=prefix;
            prefix=prefix*nums[i];
        }
        for(int i=len-2;i>-1;i--)
        {
            res[i]=res[i]*sufix;
            sufix=sufix*nums[i];
        }
        return res;
    }
}  
