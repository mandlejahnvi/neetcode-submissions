class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        Map<Integer, Integer> map= new HashMap<>();
        int[] res= new int[len1];
        for(int i=0;i<len1;i++)
        {
            for(int j=0;j<len2;j++)
            {
                if(nums1[i]==nums2[j])
                    map.put(nums1[i],j);
            }
        }
        for(int i=0;i<len1;i++)
        {
            int found=0;
            for(int j=map.get(nums1[i])+1;j<len2;j++)
            {
                if(nums1[i]<nums2[j])
                {
                    found=1;
                    res[i]=nums2[j];
                    System.out.println(j);
                    break;
                }
            }
            if(found==0)
                res[i]=-1;
        }
        return res;
    }
}