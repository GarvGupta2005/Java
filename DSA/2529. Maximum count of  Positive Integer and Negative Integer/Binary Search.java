// O(log n) time
class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        // Count negative numbers: first index where nums[i] >= 0
        int negCount = findFirstIndex(nums, 0);

        // Count positive numbers: first index where nums[i] > 0
        int posCount = n - findFirstIndex(nums, 1);

        return Math.max(negCount, posCount);
    }

    // Finds the first index where nums[i] >= target
    private int findFirstIndex(int[] nums, int target) {
        int left = 0, right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
