class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        outer:
        for(int i = 0; i<nums.length; i++)
        {
            for(int j = i+1; j<nums.length; j++)
            {
                if(nums[i]==nums[j])
                {
                    continue outer;
                } 
            }
            nums[k] = nums[i];
            k++;
        }
        return k;
    }
}
