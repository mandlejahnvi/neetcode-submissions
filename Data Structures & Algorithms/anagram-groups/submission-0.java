class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len=strs.length;
        Map<String, List<String>> map= new HashMap<>();
        for(String str: strs)
        {
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            map.putIfAbsent(new String(ch), new ArrayList<>());
            map.get(new String(ch)).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
