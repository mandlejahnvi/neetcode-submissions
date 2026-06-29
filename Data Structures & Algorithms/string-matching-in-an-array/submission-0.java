class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        int len= words.length;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(words[i]==words[j])
                    continue;
                if(words[j].contains(words[i])){
                    res.add(words[i]);
                    break;
                }         
            }
        }
        return res;
    }
}