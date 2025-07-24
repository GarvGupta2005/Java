class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                increasing = false; // it's not increasing
            }
            if (nums[i] < nums[i + 1]) {
                decreasing = false; // it's not decreasing
            }
        }

        return increasing || decreasing; // true if either one holds
    }
}
