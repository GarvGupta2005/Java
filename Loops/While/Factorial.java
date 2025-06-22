import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int i = num;
    int Fact = 1;
    while(i!=0){
      Fact = Fact*i;
      i--;
    }
    System.out.println("Factorial of "+num+ " is "+Fact);
  }
}
