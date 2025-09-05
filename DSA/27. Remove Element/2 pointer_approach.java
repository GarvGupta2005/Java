class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;
        int i = 0;
        while(k<nums.length)
        {
            if(nums[k] != val)
            {
                nums[i] = nums[k];
                i++;
            }
            k++;
        }
        return i;
    }    
}
