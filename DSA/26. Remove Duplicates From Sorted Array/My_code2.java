class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        
        for (int i = 0; i < nums.length; i++) {
            boolean isDuplicate = false;
            
            // Check if nums[i] appeared before i
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (!isDuplicate) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;
    }
}
