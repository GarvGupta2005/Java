public class Main {
public static int sum(int start, int end) {
    if (end > start) {
      return end + sum(start, end - 1);
    } else {
      return end;
    }
  }
  public static void main(String[] args) {
    int result = sum(5, 10);
    System.out.println(result);
  }
  
}

/*
10 +(5+9)
10+9+(5+8)
10+9+8+(5+7)
10+9+8+7+(5+6)
10+9+8+7+6+(5)//5 is because of else(5,5) return 5
  */
