class Solution {
    public int[] replaceElements(int[] arr) {
        int len=arr.length;
        int[] res= new int[len];
        int max=Integer.MIN_VALUE;
        for(int i=len-1;i>0;i--)
        {
            max=Math.max(max,arr[i]);
            res[i-1]=max;
        }
        res[len-1]=-1;
        return res;
    }
}