class Solution {
    public int maxArea(int[] heights) {
        int len=heights.length;
        int max= Integer.MIN_VALUE;
        int left=0, right=len-1;
        while(left<right && right>-1)
        {
            int area=(right-left)*(Math.min(heights[left],heights[right]));
            max=Math.max(max, area);
            if(heights[left]<heights[right])
                left++;
            else
                right--;
        }
        return max;
    }
}
