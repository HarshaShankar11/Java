import java.util.Scanner;
 
public class PowerSquare {
 
public static void main(String[] args) {
try (Scanner scan = new Scanner(System.in)) {
	System.out.println("Enter a Number");
	int num=scan.nextInt();
	System.out.println(Powersq.squareNumber(num));
}
}
}


