public class Main {
    public static int sum(int k) {
        if (k == 0)  // Base case to stop recursion
            return 0;
        return k + sum(k - 1);
    }

    public static void main(String[] args) {
        int k = 5;
        if (k == 0) {
            System.out.print(0);
        } else {
            System.out.print(sum(k));
        }
    }
}
