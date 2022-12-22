import java.util.*;

class jSort {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();

        System.out.print("Input Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        sort(A);
        
        System.out.println();

        System.out.print("Output Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        sc.close();
    }

    static void sort(int[] A) {
        boolean swapped;
        for (int i = 0; i < A.length; i++) {
            swapped = false;
            for (int j = 1; j < A.length - i; j++)
                if (A[j - 1] >A[j]) {
                    swap(A, j - 1, j);
                    swapped = true;
                }
            if (!swapped)
                break;
        }
    }

    static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}