class Solution {
    public int scoreOfString(String s) {
        char[] str = s.toCharArray();
        int len=s.length();
        int sum=0;
        for(int i=1;i<len;i++)
        {
            sum=sum+Math.abs(str[i]-str[i-1]);
        }
        return sum;
    }
}