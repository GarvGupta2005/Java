// Length
public class Main {
  public static void main(String[] args) {
    String greet = "Good Morning";
    System.out.print("Length of greet is : " + greet.length());
  }
}


// upercase and lowercase
public class Main {
  public static void main(String[] args) {
    String txt = "Hello World";
    System.out.println(txt.toUpperCase());
    System.out.println(txt.toLowerCase());
  }
}


// finding character
public class Main {
  public static void main(String[] args) {
    String txt = "Please locate where 'locate' occurs!";
    System.out.println(txt.indexOf("locate"));
  }
}


// Concatinatiom
public class Main {
  public static void main(String[] args) {
    String firstName = "John ";
    String lastName = "Doe";
    System.out.println(firstName.concat(lastName));
  }
}
// if we add string and number output will be string


// chatAt the specified index
public class Main {
  public static void main(String[] args) {
    String myStr = "Hello";
    char result = myStr.charAt(0);
    System.out.println(result);
  }
}


//compareTo() compares two strings
public class Main {
  public static void main(String[] args) {
    String myStr1 = "Hello";
    String myStr2 = "Hello";
    System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal
  }
}


//contains()
public class Main {
  public static void main(String[] args) {
    String myStr = "Hello";
    System.out.println(myStr.contains("Hel"));
    System.out.println(myStr.contains("e"));
    System.out.println(myStr.contains("Hi"));
  }
}


//equals()
public class Main {
  public static void main(String[] args) {
    String myStr1 = "Hell2o";
    String myStr2 = "Hell2o";
    String myStr3 = "Another String";
    System.out.println(myStr1.equals(myStr2));  //true
    System.out.println(myStr1.equals(myStr3));  //false
  }
}


//
