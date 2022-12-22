import java.util.Scanner;

public class MethodOver {

	static void area(int a) {
		System.out.println("Area of Square: " + (a * a));
	}

	static void area(int a, int b) {
		System.out.println("Area of Rectangle: " + (a * b));

	}

	static void area(int a, int b, int c) {
		double s = (a + b + c) / 2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("Area of Triangle: " + area);
	}

	public static void main(String args[]) {

		area(5);
		area(5, 6);
		area(5, 6, 7);

	}

}