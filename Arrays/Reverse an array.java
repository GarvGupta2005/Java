import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter size of array: ");
    int size = sc.nextInt();
    
    int arr[] = new int[size];
    for(int i = 0; i<size; i++){
      arr[i] = sc.nextInt();
    }
    for(int j=size-1; j>=0; j--){
      System.out.print(" "+j+" ");
    }
  }
}
