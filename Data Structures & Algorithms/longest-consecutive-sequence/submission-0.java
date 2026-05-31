class Solution {
    public int longestConsecutive(int[] nums) {
        int len=nums.length;
        int max=0;
        for(int i=0;i<len;i++)
        {
            int[] visited = new int[len];
            max= Math.max(max,longest(nums, visited, nums[i],len));
        }
        return max;
    }
    public int longest(int[] nums, int[] visited, int item, int len)
    {
        int found=0;
        int sum=0;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==item && visited[i]==0){
                found=1;
                visited[i]=1;
                break;
            }         
        }
        if(found==1)
            sum=1+longest(nums, visited, item+1, len);
        return sum;
    }
}
