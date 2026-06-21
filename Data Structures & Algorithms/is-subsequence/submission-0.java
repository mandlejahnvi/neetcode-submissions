class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0, len=s.length(); 
        for(char ch: t.toCharArray())
        {
            if(i<len && ch==s.charAt(i))
            {
                i++;
            }
        }
        if(i==len)
            return true;
        else
            return false;
    }
}