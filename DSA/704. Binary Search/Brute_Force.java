class Solution {
    public int search(int[] nums, int target) {
        
        int start = 0;
        while(start<nums.length)
        {
            if(target == nums[start])
            {
                return start;
            }
            start++;
        }
        return -1;
    }
}
