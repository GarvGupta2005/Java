import java.util.Arrays;

class Solution {
    public int findGCD(int[] nums) {
        
        int len = nums.length - 1;

        Arrays.sort(nums);

        for (int i = nums[0]; i >= 1; i--) {
            if (nums[0] % i == 0 && nums[len] % i == 0) {
                return i; 
            }
        }
        return 1;
    }
}
