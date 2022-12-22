import java.util.Scanner;

public class CheckVowelConsonent {
    public static void main(String args[]) {
        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int Vow = 0, Consonent = 0;

        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                Vow++;
            } else if (s.charAt(i) == ' ') {
                continue;
            } else {
                Consonent++;
            }
        }
        System.out.println();
        System.out.println("Number of Vowels are : " + Vow);
        System.out.println("Number of Consonent are : " + Consonent);
        
        sc.close();
    }
}
