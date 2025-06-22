import java.util.Scanner ; 
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.printf("Enter length : ");
        int n = sc.nextInt() ;
        int arr[] = new int[n];
        for(int i = 0 ; i < arr.length ; i++)  // take user input
        {
            arr[i] = sc.nextInt() ;     
        } 
        
        for(int i = 0 ; i < arr.length ; i++)  // prints arrsy
        {
            System.out.print(arr[i]+" ") ;
        }
    }
}
