public class Main {
  public static void main(String[] args) {
    int num1 = 5;
    int num2 = 6;
    int num3 = 3;

    if (num1 > num2 && num1 > num3) {
      System.out.println("num1 is greatest: " + num1);
    } else if (num2 > num1 && num2 > num3) {
      System.out.println("num2 is greatest: " + num2);
    } else {
      System.out.println("num3 is greatest: " + num3);
    }
  }
}
