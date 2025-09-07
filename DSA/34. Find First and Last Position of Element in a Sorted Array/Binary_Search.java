class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int left = Leftidx(nums, target);
        int right = Rightidx(nums, target);

        return new int[]{left, right};
    }
    public int Leftidx(int []nums, int target)
    {
        int start = 0;
        int end = nums.length - 1;
        int idx = -1;

        while(start <= end)
        {
            int mid = (start+end)/2;

            if(nums[mid] == target)
            {
                idx = mid;
                end = mid-1;
            }
            else if(nums[mid] < target)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return idx;
    }
    public int Rightidx(int []nums, int target)
    {
        int start = 0;
        int end = nums.length - 1;
        int idx = -1;

        while(start <= end)
        {
            int mid = (start+end)/2;

            if(nums[mid] == target)
            {
                idx = mid;
                start = mid+1;
            }
            else if(nums[mid] < target)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return idx;
    }    
}
