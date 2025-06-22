import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        k = k % size; 

        int[] temp = new int[size];

        for (int j = 0; j < size - k; j++) {
            temp[j] = arr[k + j];
        }

        for (int z = size - k; z < size; z++) {
            temp[z] = arr[z - (size - k)];
        }

        for (int i = 0; i < size; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
