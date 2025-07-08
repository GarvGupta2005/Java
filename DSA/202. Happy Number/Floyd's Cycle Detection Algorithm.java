class Solution {
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int orig_num = n;
            int sqre = 0;
            while (orig_num != 0) {
                int val = orig_num % 10;
                sqre += val * val;
                orig_num /= 10;
            }
            n = sqre;
        }
        return n == 1;
    }
}
