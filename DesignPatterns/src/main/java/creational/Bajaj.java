package creational;

public class Bajaj implements Bike{
	String name;
	int min_cost,max_cost;
	public Bajaj()
	{
		name="Bajaj";
		min_cost=50000;
		max_cost=150000;
	}
	
	public void getDetails()
	{
		System.out.println("Cost of "+name+" ranges from"+min_cost+" to "+max_cost);
	}	
}
