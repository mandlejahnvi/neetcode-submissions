class Solution {
    public int[] replaceElements(int[] arr) {
        int len=arr.length;
        int[] res= new int[len];
        for(int i=0;i<len;i++)
        {
            int max= Integer.MIN_VALUE;
            for(int j=i+1;j<len;j++)
            {
                max=Math.max(max, arr[j]);
            }
            res[i]=max;
        }
        res[len-1]=-1;
        return res;
    }
}