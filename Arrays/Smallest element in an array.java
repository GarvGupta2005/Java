import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        
        int nums[] = {23, 9, 92, 93, 32, 73, 10, 34};
        Arrays.sort(nums);
        
        System.out.print("Smallest number is: "+nums[0]);
        
    }
}

/*
public class Main {
  public static void main(String[] args) {
   
    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
    int lowestAge = ages[0];

    for (int age : ages) {
      if (lowestAge > age) {
        lowestAge = age;
      }
    }

    System.out.println("The lowest age in the array is: " + lowestAge);
  }
}
*/
