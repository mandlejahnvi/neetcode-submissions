class Solution {
    public boolean check(int[] nums) {
        int len=nums.length;
        int count=0;
        for(int i=0;i<len-1;i++)
        {
            if(nums[i]>nums[i+1])
                count++;
        }
        if(count<1)
            return true;
        else if(count==1 && nums[0]>=nums[len-1])
            return true;
        return false;
    }
}