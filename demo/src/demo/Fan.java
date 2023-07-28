package demo;

public class Fan {
	String brand;
	String colour;
	int cost;

	void blows_Air()
	{
		System.out.println(brand+" "+"fan is blowing air ");
		
	}
	
	void rotate()
	{
		System.out.println(brand+""+colour+"colour fan is roatating");
	}
	
	public Fan(String a,String b, int c)
	{
		brand=a;
		colour=b;
		cost=c;
		
	}
}

