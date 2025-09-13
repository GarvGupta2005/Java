import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        int vote = 0 ; 
        int majority = 0 ; 
        for(int i = 0 ; i < nums.length ;i++)
        {
            if(vote == 0)
            {
                vote = 1 ; 
                majority = nums[i] ; 
            }
            else if(majority == nums[i]) {
                vote++ ;
            }

            else{
                vote-- ; 
            }
        }
        return majority ; 
    }
}
