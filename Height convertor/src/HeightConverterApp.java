import java.util.Scanner;

public class HeightConverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Height in Inches");
		double inches=scan.nextDouble();
		 HeightConverter converter = new HeightConverter();
	        double feet = converter.convertInchesToFeet(inches);
	        System.out.printf("%.2f", feet);

	        scan.close();
	}

}
