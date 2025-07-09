class Solution {
    public int removeElement(int[] nums, int val) {
        
        int j = 0;

        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]!=val)
            {
                nums[j]=nums[i];
                j++;
            }
        }

        for(int k = j; k<nums.length; k++)
        {
            nums[k]=-1;
        }
        return j;
    }
}
