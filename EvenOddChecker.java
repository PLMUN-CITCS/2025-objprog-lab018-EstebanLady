
import java.util.Scanner;
public class EvenOddChecker {
  public static void main(String[] args) {
     int n = getIntegerInput();
     checkEvenOrOdd( n);
  }
  public static int getIntegerInput() {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    int n = input.nextInt();
    
    if (n >= 0){
        
    }else {
        System.out.print("ERROR! Please Enter an integer");
    }
    return n;
  }
  
  public static int checkEvenOrOdd(int n) {
      
    
    if ((n%2) == 0){
        System.out.print(n + " is Even number" );
    } else {
        System.out.print(n + " Is an Odd Number");
    }
       return n;
  }
}
    
    
    
    
  
  
