class Solution {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        int max=0, count=0;int prev=nums[0];
        int res=nums[0];
        for(int i=0;i<len;i++)
        {
            if(prev==nums[i]){
                count++;
                if(max<count)
                {
                    res=nums[i];
                    max=count;
                }
            }
            else{
                prev=nums[i];
                count=1;
            }   
        }
        return res;
    }
}