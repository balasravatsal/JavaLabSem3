import java.util.Scanner;

public class ass3q11 {
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ass3q11 ob = new ass3q11();
        int arr[] = { 1,11,111,112,300,444 };
        int n = arr.length;
        System.out.println("Enter a target Element: ");
        int x = sc.nextInt();
        int result = ob.binarySearch(arr, 0, n - 1, x);
        try {
            if (result == -1) {
                System.out.println("Element not present");
                throw new ArrayIndexOutOfBoundsException();
            } else {
                System.out.println("Element found at Index number: " + result);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of bound: " + e);
        }
        sc.close();
    }
}
