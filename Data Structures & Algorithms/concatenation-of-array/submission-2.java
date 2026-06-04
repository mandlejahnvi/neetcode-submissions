class Solution {
    public int[] getConcatenation(int[] nums) {
        int len= nums.length;
        int[] res= new int[len*2];
        for(int i=0;i<len/2+1;i++)
        {
            res[i]=nums[i];
            res[len*2-1-i]=nums[len-i-1];
            res[i+len]=nums[i];
            res[len-i-1]=nums[len-i-1];
        }
        return res;
    }
}