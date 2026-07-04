class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len= s.length();
        if(len==0)
            return 0;
        int res=1;
        int left=0,right=0;
        Map<Character, Integer> map=new HashMap<>();
        while(left<=right && right<len)
        {
            if(map.containsKey(s.charAt(right)))
            {
                res=Math.max(right-left, res);
                left=Math.max(map.get(s.charAt(right))+1,left);
            }
            map.put(s.charAt(right), right);
            right++;
        }
        res=Math.max(right-left, res);
        return res;
    }
}
