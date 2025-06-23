import java.util.Scanner;
public class Main{

    public static int factorial(int x){
        if(x==0 || x==1){
            return 1;
        }
        else{
            return x*factorial(x-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        
        System.out.print("Factorial of "+x+" is: ");
        System.out.print(factorial(x));
    } 
}
