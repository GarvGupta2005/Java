import java.util.Scanner;
public class Main{
    public static int fibonacci(int num){
        if (num == 0){   //base condition
            return 0;
        }    
        else if (num == 1){   //base condition
            return 1;
        }    
        else{
            return fibonacci(num-1)+fibonacci(num-2);
            }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        System.out.print("Fibonacci number at position "+num+" is: "+fibonacci(num));
    }
}


/*fibonacci(4)
  fibonacci(3) + fibonacci(2)
  fibonacci(2) + fibonacci(1)  + fibonacci(1) + fibonacci(0)
  fibonacci(1) + fibonacci(0)  + 1 + 1 + 0
  1 + 0 + 1 + 1 + 0
  3
*/
