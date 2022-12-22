import java.util.*;

public class ass3q7 {

    public static void main(String Args[]) {

        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter 2 number");
        a = sc.nextInt();
        b = sc.nextInt();

        try {
            if (b == 0) {
                throw new ArithmeticException();
            } else {
                System.out.println("Result: " + a / b);
            }

        } catch (Exception e) {
            System.out.println("Division by 0 not possible" + e);
        }
        sc.close();

    }

}