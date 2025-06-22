import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    int i = num;
    int count = 0;

    while (i != 0) {
      i = i / 10;
      count++;
    }

    System.out.println("Number of digits are " + count);
  }
}
