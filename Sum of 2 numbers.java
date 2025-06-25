// add 2 number
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        System.out.print("Enter number: ");
        int b = sc.nextInt();
        int result = a+b;
        
        System.out.print("Sum of numbers is: "+result);
    }
}
