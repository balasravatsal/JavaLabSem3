import java.util.Scanner;

class details {
    private int age;
    public int marks;
    final int finalVariable = 1;
    public void SetData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        age = sc.nextInt();
        System.out.print("Enter your Marks : ");
        marks = sc.nextInt();
    }
    public void display(){
        System.out.println("Age entered: "+age+"\nMarks entered: "+marks+"\nfinalVariable : "+finalVariable);
    }
}

public class que5_1{
    public static void main(String[] args) {
        details a1 = new details();
        a1.SetData();
        a1.display();

        a1.marks = 98;

    }
}
