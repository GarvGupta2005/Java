class Solution {
    public int differenceOfSums(int n, int m) {
        int totalSum = n * (n + 1) / 2;

        int count = n / m;
        int last = count * m;
        int sumDiv = (m + last) * count / 2;

        return totalSum - 2 * sumDiv;
    }
}
