class Solution {
    public int removeDuplicates(int[] nums) {
        
        int start = 0;
        int end = nums.length - 1;

        int i = 0;
        int j = 1;
        
        while(j<nums.length)
        {
            if(nums[i] != nums[j])
            {
                i++;
                nums[i] = nums[j];
                
            }
            j++;
        }
        return i+1;
    }
}
