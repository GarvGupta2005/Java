//334/420 testcases
class Solution {
    public boolean isHappy(int n) {
        while (n >= 10) {
            int orig_num = n;
            int sqre = 0;
            while (orig_num != 0) {
                int val = orig_num % 10;
                sqre += val * val;
                orig_num /= 10;
            }

            int num = sqre;
            while (num >= 10) {
                int temp = num;
                num = 0;
                while (temp != 0) {
                    num += temp % 10;
                    temp /= 10;
                }
            }
            n = num;
        }

        return n == 1;
    }
}
