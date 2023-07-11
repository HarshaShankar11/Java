import java.util.Scanner;

public class CubeNumberApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to find its cube");
		int num=scan.nextInt();
		System.out.println(PowerCube.cubeNumber(num));
		
		
		
		scan.close();
	}
	
}
