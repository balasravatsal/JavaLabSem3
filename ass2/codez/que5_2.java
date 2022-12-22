import java.util.Scanner;
class detail {
    private int age;
    public int marks;
    final int finalV1 = 10;
    public void SetData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age :");
        age = sc.nextInt();
        System.out.print("Enter your Marks : ");
        marks = sc.nextInt();
    }
    public void display(){
        System.out.println("Age: "+age+", Marks: "+marks+", finalVariable 1 :"+finalV1);
    }
    public void incr(int finalV2){
        finalV2++;
        System.err.println("Pass by value : "+finalV2);
    }
    public void incr2(detail a){
        a.marks++;
        System.out.println("Pass by reference : "+a.marks);
    }
}
public class que5_2{
    public static void main(String[] args) {
        detail a1 = new detail();
        a1.SetData();
        a1.display();
        detail a2 = new detail();
        a2.SetData();
        a2.display();
        int finalV2=8;
        System.out.println("finalVariable 2 = "+finalV2);
        a1.incr(finalV2);
        System.out.println("Marks :"+a1.marks);
        a1.incr2(a2);
    }
}
