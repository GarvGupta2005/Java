import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array: ");
    int size = sc.nextInt();
     
    int[] arr = new int[size];
    System.out.println("enter elements");
    for(int i = 0; i<size; i++){
      arr[i] = sc.nextInt();
    }

    int max1,max2;
    if(arr[0]<arr[1]){
      max1 = arr[1];
      max2 = arr[0];
    } 
    else{
      max1 = arr[0];
      max2 = arr[1];
    }
    for(int j = 2; j<size; j++){
      if(arr[j]>max1){
        max2 = max1;
        max1 = arr[j];
      }
      else if(arr[j]<max1 && arr[j]>max2){
        max2=arr[j];
      }
    }
    System.out.println("Second largest element is: " + max2);
  }
} 
