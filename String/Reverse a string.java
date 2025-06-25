import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        String str = "one two three";
//      reversedStr = "";
        
        for(int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        } 
/*
        for (int i = 0; i<strtr.length(); i++) {
            reversedStr = str.charAt(i) + reversedStr;
        }
    
        System.out.println("Reversed string: "+ reversedStr);
*/
    }
}
