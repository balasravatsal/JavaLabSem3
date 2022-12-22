import java.util.Scanner;

public class nPrime2 {
   public static void main(String args[]) {
      int n;
      int flag = 1;
      int num = 3;
      
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the value of n:");
      n = scanner.nextInt();
      
      if (n >= 1) {
         System.out.println("Prime numbers are: ");
         System.out.print("2 ");
      }
      
      int i = 2;
      while(i <= n) {
         for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
               flag = 0;
               break;
            }
         }
         if (flag != 0) {
            System.out.print(num + " ");
            i++;
         }
         num++;
         flag = 1;
      }

      scanner.close();
   }
}
