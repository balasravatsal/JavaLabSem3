import java.util.*;

public class maxOfNum {
    public static void main (String args[]){
        System.out.print("Enter first Number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.print("Enter Third Number : ");
        int c = sc.nextInt();
        System.out.println();
        
        // Using ternery operator
        int d = (a>b&&a>c)?a:(b>c&&b>a)?b:c;
		System.out.println("Highest number is : "+ d + " (Using ternery operator)");

        
        // Using if else 
        if(a>b&&a>c){
            System.out.println(a +" is the highest number (Using conditional statements)");
        }else if (b>a&&b>c) {
            System.out.println(b +" is the highest number (Using conditional statements)");
        }else{
            System.out.println(c +" is the highest number (Using conditional statements)");
        }
        System.out.println();
        sc.close();
    }
} 
