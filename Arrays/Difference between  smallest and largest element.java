import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array: ");
    int size = sc.nextInt();

    int arr[] = new int[size];
    int i=0;
    while(i!=size){
      System.out.println("Enter element:");
      arr[i] = sc.nextInt();
      i++;
    }

    int largest = arr[0];
    int smallest = arr[0];
    for(int j=0; j<size; j++){
      if(largest<arr[j]){
        largest=arr[j];
      }
      if(smallest>arr[j]){
        smallest=arr[j];
      }
    }
    int Difference = largest-smallest;
    System.out.println("Difference is "+Difference);
  }
}
