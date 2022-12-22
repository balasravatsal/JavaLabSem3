import java.util.Scanner;

public class PyramidDesign {
    public static void main(String args[]) {

        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        char str[] = new char[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            char c;
            c = s.charAt(i);
            str[i] = c;
        }
        
        for (int i = 1; i <= s.length(); i++) {
            int j;
            for (j = 1; j <= s.length() - i; j++) {
                System.out.print(" ");
            }
            i = 0;
            for (; j <= s.length(); j++) {
                System.out.print(str[i] + " ");
                i++;
            }
            System.out.println();
        }
        sc.close();
    }
}
