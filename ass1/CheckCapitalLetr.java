import java.util.*;

public class CheckCapitalLetr {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        String a, inp;
        String str[];
        char c;
        int count = 0, i;

        inp = sc.nextLine();
        str = inp.split(" ");
        for (i = 0; i < str.length; i++){
            a = str[i];
            c = a.charAt(0);
            if (Character.isUpperCase(c)){
                count++;
            }
        }
        System.out.println("Total words starting with a captal latter are: " + count);
        sc.close();
    }

}
