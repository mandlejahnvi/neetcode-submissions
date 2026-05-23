class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map= new HashMap<>();
        int len=nums.length;
        for(int i=0;i<len;i++)
        {
            if(map.containsKey(nums[i]))
                return true;
            map.put(nums[i],1);
        }
        return false;
    }
}