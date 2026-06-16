class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map=new HashMap<>();
        int len=heights.length;
        for(int i=0;i<len;i++)
        {
            map.put(heights[i], names[i]);
        }
        String[] res= new String[len];
        Arrays.sort(heights);
        for(int i=0;i<len;i++)
        {
            res[len-i-1]=map.get(heights[i]);
        }
        return res;
    }
}