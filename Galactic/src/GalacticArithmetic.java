import java.util.Scanner;

public class GalacticArithmetic {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			long num1=scanner.nextInt();
			long num2=scanner.nextInt();
			long result=galacticAddition(num1, num2);
			System.out.println(result);
		}
	}
	public static long galacticAddition(long num1, long num2) {
			
			return num1+num2;
			
	}

}
