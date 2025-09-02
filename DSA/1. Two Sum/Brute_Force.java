class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Outer loop - pick first element
        for (int i = 0; i < nums.length; i++) {
            // Inner loop - pick second element
            for (int j = i + 1; j < nums.length; j++) {
                // Check if sum matches target
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // return indices
                }
            }
        }
        // If no pair found
        return new int[]{};
    }
}
