import java.util.*;

public class Mathclass{

    static void maxFind(double x, double y) {
        System.out.println("Maximum number of x and y is: " + Math.max(x, y));
    }

    static void minFind(double x, double y) {
        System.out.println("Minimum number of x and y is: " + Math.max(x, y));
    }

    static void sqRtFind(double x) {
        System.out.println("Square root of y is: " + Math.sqrt(x));
    }

    static void cubeRtFind(double x) {
        System.out.println("Cube root of x is : " + Math.cbrt(x));
    }

    static void sqFind(double x, double y) {
        System.out.println("x power y is: " + Math.pow(x, y));
    }

    static void roundOffFind(double x) {
        System.out.println("Round off to nearest integer of x is : " + Math.abs(x));
    }

    static void logFind(double x) {
        System.out.println("Logarithm of x is: " + Math.log(x));
    }

    static void expFind(double x) {
        System.out.println("Exponentional of x is: " + Math.exp(x));
    }

    static void sinFind(double x) {
        System.out.println("Sin of x is: " + Math.sin(x));
    }

    static void cosFind(double x) {
        System.out.println("Cos of x is: " + Math.cos(x));
    }

    static void tanFind(double x) {
        System.out.println("Tan of x is: " + Math.tan(x));
    }

    static void sinhFind(double x) {
        System.out.println("Sinh of x is: " + Math.sinh(x));
    }

    static void coshFind(double x) {
        System.out.println("Cosh of x is: " + Math.cosh(x));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fisrt numbers: ");
        double x = sc.nextDouble();
        System.out.print("Enter Second number: ");
        double y = sc.nextDouble();

        System.out.println("Press : \n"
                + " 1 for finding Maximum\n"
                + " 2 for finding Minimum\n"
                + " 3 for SquareRoot\n"
                + " 4 for CudeRoot\n"
                + " 5 for Square\n"
                + " 6 for Rounding Off\n"
                + " 7 for taking Log\n"
                + " 8 for Exponentional\n"
                + " 9 for finding Sin\n"
                + "10 for finding Cos\n"
                + "11 for finding Tan\n"
                + "12 for finding Sinh\n"
                + "13 for finding Cosh\n");

        System.out.print("Enter your operation: ");
        int inputU = sc.nextInt();

        switch (inputU) {

            case 1:
                maxFind(x, y);
                break;

            case 2:
                minFind(x, y);
                break;

            case 3:
                sqRtFind(x);
                break;

            case 4:
                cubeRtFind(x);
                break;

            case 5:
                sqFind(x, y);
                break;

            case 6:
                roundOffFind(x);
                break;

            case 7:
                logFind(x);
                break;

            case 8:
                expFind(x);
                break;

            case 9:
                sinFind(x);
                break;

            case 10:
                cosFind(x);
                break;

            case 11:
                tanFind(x);
                break;

            case 12:
                sinhFind(x);
                break;

            case 13:
                coshFind(x);
                break;

        }

        System.out.println();
    }
}
