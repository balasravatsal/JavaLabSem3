import java.util.*;

public class Eigth {
	public static void main(String args[]) {
		char x;

		// System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		while(true) {

			System.out.print("Enter a string: ");
			int v = 0, c = 0;
			String str;
			str = sc.nextLine();
		

			if (str.equals("quit")) {
				break;
			}
			for (int l = 0; l < str.length(); l++) {
				x = str.charAt(l);
				if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
					v++;
				else if (x >= 'a' && x <= 'z')
					c++;		
			}
		
		System.out.println( "Number of vowels : " + v + "\nNumber of consonant : " + c + "\n");
	
	}
	}
}