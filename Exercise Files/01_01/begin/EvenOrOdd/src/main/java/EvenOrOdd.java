import java.util.Scanner;

public class EvenOrOdd {

   public static boolean isEven(int n) {
	//   if(n % 2 == 0) {
		 //  return true;
		   
	  // }
     //  return false;
	   return n % 2 == 0;
	   //return (n & 1) == 0;
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter a number: ");
       int userNum = scanner.nextInt();
       System.out.println("Is the number even? " + isEven(userNum));
       scanner.close();
   }
}
