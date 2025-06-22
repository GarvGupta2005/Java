import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            System.out.println("enter element");
            arr[i] = sc.nextInt();
        }
         
        System.out.print("Enter k: "); 
        int k = sc.nextInt();
        k = k%size;
        
        int[] temp = new int[size];
        for(int j = 0; j<size-k; j++){
            temp[j] = arr[j+k];
        }
        //temp = [3 4 5]
        //size-k = 3
        for(int z = size-k; z<size; z++){
            temp[z] = arr[z-(size-k)];
        }
        
        System.out.print("rotated array: ");
        for(int b = 0; b<size; b++){
            System.out.print(temp[b]+" ");
        }
    }
}
