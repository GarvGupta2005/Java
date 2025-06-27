class Solution {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }

        while (num > 9) {
            int res = 0;
            while (num != 0) {
                res += num % 10;
                num /= 10;
            }
            num = res;
        }

        return num;
    }
}
