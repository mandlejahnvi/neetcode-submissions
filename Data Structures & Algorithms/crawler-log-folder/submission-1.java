class Solution {
    public int minOperations(String[] logs) {
        int count=0;
        for(String str: logs)
        {
            if(str.equals("../") && count>0)
                count--;
            else if(str.equals("../") && count==0)
                count=count;
            else if(str.equals("./"))
                count=count;
            else
                count++;
        }
        return count;
    }
}