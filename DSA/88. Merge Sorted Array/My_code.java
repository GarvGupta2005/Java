class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        List<Integer> nums3 = new ArrayList<>();
        
        for(int i = 0; i<m; i++)
        {
            nums3.add(nums1[i]);
        }

        for(int j = 0; j<n; j++)
        {
            nums3.add(nums2[j]);
        }

        Collections.sort(nums3);

        for (int i = 0; i < nums3.size(); i++)
        {
            nums1[i] = nums3.get(i);
        }
        
    }
}
