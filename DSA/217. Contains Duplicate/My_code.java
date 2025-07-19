Time Limit Exceeded
70/77

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        for(int i = 0; i<nums.length-1; i++)
        {
            int count = 0;
            for(int j = i+1; j<nums.length; j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count>=1)
            {
                return true;
            }
        }
        return false;
    }
}
