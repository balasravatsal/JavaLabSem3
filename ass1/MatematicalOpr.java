import java.util.*;
public class MatematicalOpr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print(("Enter second number : "));
        int b = sc.nextInt();

        System.out.println();

        int c=a+b;
        System.out.println("Summation of " + a + " and " + b + " is      : "+c);
        int d=a-b;
        System.out.println("Difference of " + a + " and " + b + " is     : "+d);
        int e=a*b;
        System.out.println("Multiplication of " + a + " and " + b + " is : "+e);
        int f=a/b;
        System.out.println("Division of " + a + " and " + b + " is       : "+f);
        int g=a%b;
        System.out.println("Modulus of " + a + " and " + b + " is        : "+g);

        System.out.println();
        sc.close();
    }
}
