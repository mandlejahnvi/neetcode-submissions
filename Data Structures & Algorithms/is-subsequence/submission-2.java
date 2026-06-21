class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0, len=s.length(), length=t.length(); 
        for(int j=0;j<length;j++)
        {
            if(i==len)
                return true;
            if(t.charAt(j)==s.charAt(i))
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