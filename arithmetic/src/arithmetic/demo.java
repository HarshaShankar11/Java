package arithmetic;

import java.util.Scanner;

class Rectangle{
public void areaOfRectangle(int a, int b) {
	System.out.println("Area of rectangle="+(a*b));
	
}
}

public class demo {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("User enter the length");
	int l=scan.nextInt();
	System.out.println("=====================");
	System.out.println("User enter the breadth");
	int b=scan.nextInt();
	Rectangle r = new Rectangle();
	r.areaOfRectangle(l, b);
}
}
