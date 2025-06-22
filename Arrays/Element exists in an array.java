import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];

    System.out.print("Enter element: ");
    int element = sc.nextInt();

    System.out.println("Enter " + size + " elements:");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    boolean found = false;
    for (int num : arr){
      if(element==num){
        found = true;
        break;
      }
    } 
    if(found==true){
      System.out.println("Element "+element+" is in array");
    }
    else{
      System.out.println("Element "+element+" is not in array");
    }
  }
}
