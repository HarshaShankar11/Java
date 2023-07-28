import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String arr[]=new String[10];
		System.out.println("Enter the Height of the players");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the Height of Player"+i);
			arr[i]=scan.next();
		}
		System.out.println("Names of  are..");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+"  ");
		}
		scan.close();
		
		
		

	}

}
