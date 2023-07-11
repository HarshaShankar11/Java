import java.util.Scanner;

public class PlanetExplorerApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Radius");
		double radius=scan.nextDouble();
		PlanetExplorer explorer = new PlanetExplorer();
        double surfaceArea = explorer.calculateSurfaceArea(radius);
        System.out.printf("The surface area of the sphere with radius %.2f is %.2f\n", radius, surfaceArea);
    
        scan.close();
	}


	}


