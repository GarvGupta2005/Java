import java.util.*;

public class Main {

    public static boolean isValidArray(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0 || arr[j] == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element:");
            arr[i] = sc.nextInt();
        }

        boolean result = isValidArray(arr);
        System.out.println(result);
    }
}
