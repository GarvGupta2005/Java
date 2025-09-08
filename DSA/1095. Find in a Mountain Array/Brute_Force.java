//  Time Limit Exceeds
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        for(int i = 0; i<mountainArr.length(); i++)
        {
            if(mountainArr.get(i) == target)
            {
                return i;
            }
        }
        return -1;
    }
}
