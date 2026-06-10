class Solution {
    public int heightChecker(int[] heights) {
        int len=heights.length;
        int[] unsorted= heights.clone();
        int count=0;
        Arrays.sort(heights);
        for(int i=0;i<len;i++)
        {
            if(heights[i]!=unsorted[i])
                count++;
        }
        return count;
    }
}