class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        Map<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<len;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                int[] res= {map.get(target-nums[i]), i};
                return res;
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
