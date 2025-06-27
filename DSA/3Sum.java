Time Limit Exceeded

/*
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0;i<nums.length; i++)
        {
            for(int j = 0;j<nums.length; j++)
            {
                for(int k = 0;k<nums.length; k++)
                {
                    if((i!=j & i!=k & j!=k))
                    {
                        if(nums[i]+nums[j]+nums[k]==0)
                        {
                            List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                            Collections.sort(triplet);
                            if (!result.contains(triplet)) {
                                result.add(triplet);
                            }

                        }
                    }
                }
            }
        }
        return result;

    }
}
*/
