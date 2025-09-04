class Solution {
    public int findClosest(int x, int y, int z) {
        
        int pos1 = Math.abs(z-x);
        int pos2 = Math.abs(z-y);

        if(pos1 > pos2)
        {
            return 2;
        }
        else if(pos1 < pos2)
        {
            return 1 ;
        }
        return 0 ; 
    }
}
