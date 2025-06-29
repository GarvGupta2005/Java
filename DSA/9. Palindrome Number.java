class Solution {
    public boolean isPalindrome(int x) {
        int rem = 0;
        int orig = x;
        if(x<0)
        {
            return false;
        }
        while(x!=0)
        {
            int digit = x % 10;
            rem = rem * 10 + digit;
            x = x / 10;
        }
        if(rem == orig)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
