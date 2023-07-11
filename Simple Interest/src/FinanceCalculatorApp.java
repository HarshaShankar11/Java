import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Principal");
		double principal=scan.nextDouble();
		System.out.println("Enter rate of interest");
		double rate=scan.nextDouble();
		System.out.println("Enter time period in years");
		double time=scan.nextDouble();
		FinanceCalculator calculator = new FinanceCalculator();
        double simpleInterest = calculator.calculateSimpleInterest(principal, rate, time);
        System.out.printf("Simple Interest: %.2f%n", simpleInterest);
        scan.close();
	}

}
