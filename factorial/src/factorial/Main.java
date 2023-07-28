package factorial;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

Scanner scan=new Scanner(System.in);

System.out.println("Enter number to find factorial");

int n=scan.nextInt();

int fact=1;
scan.close();
for(int i=1;i<=n;i++)

{

fact=fact*i;

}

System.out.println("Factorial of "+n+" is "+fact);

}

}