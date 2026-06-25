class Solution {
    public int strStr(String haystack, String needle) {
        int needleLen=needle.length();
        int len=haystack.length();
        for(int i=0;i<len-needleLen+1;i++)
        {
            System.out.print(haystack.substring(i,needleLen+i));
            if(haystack.substring(i,needleLen+i).equals(needle))
                return i;
        }
        return -1;
    }
}