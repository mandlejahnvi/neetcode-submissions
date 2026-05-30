class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map= new HashMap<>();
        int[] res= new int[k];
        int len=nums.length;
        for(int i=0;i<len;i++)
        {
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i],1);
        }
        Map<Integer, Integer> sortedAsc = map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()) // descending order
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, // merge function (not used here)
                        LinkedHashMap::new // preserve order
                )); 
        int i=0;
        for (Integer key : sortedAsc.keySet()) {
            if(i < k){
                res[i]=key;
                i++;
            }
            else
                break;   
        }
        return res;
    }
}