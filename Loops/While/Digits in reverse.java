import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    int i = num;
    int reversed = 0;

    while (i != 0) {
      int digit = i % 10;
      reversed = reversed * 10 + digit;
      i = i / 10;
    }

    System.out.println("Reversed number is: " + reversed);
  }
}
