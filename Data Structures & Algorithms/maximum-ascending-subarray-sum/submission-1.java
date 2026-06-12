class Solution {
    public int maxAscendingSum(int[] nums) {
        int len=nums.length;
        int sum=nums[0];
        int max=nums[0];
       for(int i=1;i<len;i++)
       {
            if(nums[i-1]<nums[i])
                sum=sum+nums[i];
            else
                sum=nums[i];
            max=Math.max(max, sum);
       } 
       return max;
    }
}