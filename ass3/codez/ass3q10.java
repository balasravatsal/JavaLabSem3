import java.util.*;

public class ass3q10 extends Exception {
    String name;
    int bal;

    public ass3q10() {
        name = "Vatsal Balasra";
        bal = 0;
    }

    public void dep() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount to deposite :");
        int d = sc.nextInt();
        bal = bal + d;
        sc.close();
    }

    public void wit(int w) {
        try {
            if (w > bal)
                throw new Exception();
            bal = bal - w;
            System.out.println("sucessfully withdraw:" + w);
        } catch (Exception e) {
            System.out.println("No sufficent fund!");
        }
    }

public static void main(String args[])
{
    ass3q10 c=new ass3q10();
c.dep();

c.wit(300);
c.wit(400);
c.wit(500);
}
}