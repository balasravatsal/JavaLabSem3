import java.util.Scanner;

class Distance {
    int ft, inch;
    public Distance(int ft, int inch) {
        this.ft = ft;
        this.inch = inch;
    }

    public Distance(Distance d) {
        ft = d.ft;
        inch = d.inch;
    }

    public Distance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the measurement in feet and inch: ");
        ft = sc.nextInt();
        inch = sc.nextInt();
    }

    public void Display() {
        System.out.println("Fisrt distance: " + ft + " feet and " + inch + " inch");
    }

    public void sum(Distance d3) {
        Distance dist = new Distance(ft, inch);
        dist.ft = ft + d3.ft;
        dist.inch = inch + d3.inch;
            if(dist.inch>=12) {
                dist.ft++;
                dist.inch-=12;
            }
        dist.Display();
    }
}

public class que2 {
    public static void main(String[] args) {
        Distance d1 =  new Distance(2,3);
        d1.Display();
        Distance d2 = new Distance();
        d2.sum(d1);;
    }
}
