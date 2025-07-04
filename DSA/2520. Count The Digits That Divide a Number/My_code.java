class Solution {
    public int countDigits(int num) {
        
        int count = 0;
        int orig_num = num;

        while(num>0)
        {
            int last_digit = num%10;
            if(orig_num%last_digit==0 && last_digit!=0)
            {
                count++;
            }
            num = num/10;
        }
        return count;
    }
}
