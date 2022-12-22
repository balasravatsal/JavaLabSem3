import java.util.Scanner;

class MatrixMultiplication {
    public static void main(String args[]) {
        int m1, n1, m2, n2, sum = 0, c, d, k;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter dimentions of first matrix");
        m1 = in.nextInt();
        n1 = in.nextInt();

        int first[][] = new int[m1][n1];

        System.out.println("Enter elements of first matrix");

        for (c = 0; c < m1; c++)
            for (d = 0; d < n1; d++)
                first[c][d] = in.nextInt();

        System.out.println("Enter dimentions of second matrix");
        m2 = in.nextInt();
        n2 = in.nextInt();

        if (n1 != m2)
            System.out.println("Sorry, can't be multiplied");
        else {
            int second[][] = new int[m2][n2];
            int multiply[][] = new int[m1][n2];

            System.out.println("Enter elements of second matrix");

            for (c = 0; c < m2; c++)
                for (d = 0; d < n2; d++)
                    second[c][d] = in.nextInt();

            for (c = 0; c < m1; c++) {
                for (d = 0; d < n2; d++) {
                    for (k = 0; k < m2; k++) {
                        sum = sum + first[c][k] * second[k][d];
                    }

                    multiply[c][d] = sum;
                    sum = 0;
                }
            }

            System.out.println("Product of the matrices:");

            for (c = 0; c < m1; c++) {
                for (d = 0; d < n2; d++)
                    System.out.print(multiply[c][d] + "\t");

                System.out.println();
            }
        }
    }
}