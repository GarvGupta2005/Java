class Solution {
    public void moveZeroes(int[] arr) 
    {
        int j = 0 ;
        for (int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] != 0)
            {
                arr[j] = arr[i] ;
                j++ ;
            }
        }

        for (int i = j ; i < arr.length ; i++)
        {
            arr[i] = 0 ; 
        }
    }
}
