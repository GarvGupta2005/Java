class Solution {
    public int majorityElement(int[] arr) 
    {
        int res = 0;
        for(int i = 0; i<arr.length; i++)
        {
            int count = 0;
            for(int j = 0; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(arr.length/2<count)
            {
                res = arr[i];
            }
        }
        return res;
    }
}
