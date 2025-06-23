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
        
        System.out.print("Enter number of terms: ");
        int num = sc.nextInt();
        
        System.out.print("Fibonacci series is : ");
        for(int i = 0; i<num; i++){
            int a = 0;
            int b = 1;
            System.out.print(fibonacci(i)+ " ");
        }
    }
}


  
  
  
  
  
