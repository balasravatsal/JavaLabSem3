import java.util.Scanner;
class Distance {
    public int ft, inch;
    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the measurement in feet and inch: ");
        ft = sc.nextInt();
        inch = sc.nextInt();
    }
    public void Display() {
        System.out.println("Result: " + ft + " feet and " + inch + " inch");
    }
    public void sum (Distance d3) {
        Distance dist = new Distance();
        dist.ft = ft + d3.ft;
        dist.inch = inch + d3.inch;
        if(dist.inch>=12) {
            dist.ft++;
            dist.inch-=12;
        }
        dist.Display();
    }
}

public class que1 {

    public static void main(String[] args) {
        Distance d1 = new Distance();

        System.out.print("In first distance ");
        d1.getData();
        Distance d2 = new Distance();
        System.out.print("In second distance ");
        d2.getData();

        d1.sum(d2);
    }
}
