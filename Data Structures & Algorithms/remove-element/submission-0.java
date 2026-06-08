class Solution {
    public int removeElement(int[] nums, int val) {
        int len=nums.length;
        int cur=0, count=0;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==val)
            {
                count++;
                continue;
            }
            if(cur<len-count)
            {
                nums[cur]=nums[i];
                cur++;
            }
        }
        return len-count;
    }
}