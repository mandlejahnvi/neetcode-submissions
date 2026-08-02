class Solution {
    public int findDuplicate(int[] nums) {
        int len= nums.length;
        Arrays.sort(nums);
        int res=nums[0];
        for(int i=1;i<len;i++)
        {
            if(nums[i]==res)
                return res;
            res=nums[i];
        }
        return res;
    }
}
