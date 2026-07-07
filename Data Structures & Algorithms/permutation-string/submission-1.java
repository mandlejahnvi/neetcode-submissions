class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int window=s1.length();
        int len=s2.length();
        int left=0, right=window-1;
        char[] string= s1.toCharArray();
        Arrays.sort(string);
        while(left<=right && right<len)
        {
            String temp=s2.substring(left, right+1);
            char[] tempString= temp.toCharArray();
            Arrays.sort(tempString);
            int flag=1;
            for(int i=0;i<window;i++)
            {
                if(string[i]==tempString[i])
                    continue;
                else
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
                return true;
            left++;
            right++;
        }
        return false;
    }
}
