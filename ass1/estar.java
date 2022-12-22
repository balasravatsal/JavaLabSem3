import java.util.*;
public class estar {
    public static void main(String[] args) {

	    int k;
        int j;
        int i;
	System.out.print("Eneter the value of n: ");
	Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();

        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (i = n - 1; i >= 1; i--) {

            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
