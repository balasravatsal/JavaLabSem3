import java.util.*;

class ass3q8 {
    public static void main(String args[]) {

        try {
            Scanner sc = new Scanner(System.in);
            int a[] = { 1, 2, 3, 4, 5 };
            int i, j;
            System.out.print("Enter index of divisor: ");
            i = sc.nextInt();
            System.out.println(a[i]);
            try {
                System.out.print("Enter index of dividend: ");
                j = sc.nextInt();
                int x = a[i] / a[j];
                System.out.println(x);
            } catch (ArithmeticException e2) {
                System.out.println("Can't divide by 0");
            }
            sc.close();
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println("Element at such index does not exists");
        }
    }
}
