import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter base: ");
        int a = sc.nextInt();
      
        System.out.print("Enter power: ");
        int b = sc.nextInt();
      
        System.out.print("a^b is: "+power(a,b));
    }
    public static int power(int a, int b){
        if(a==1){    // base condition
            return 1;
        }
        else if(b==0){   // base condition
            return 1;
        }
        else{
            return a*power(a,b-1);  // a^b = a * a^(b-1)
        }
    } 
}
