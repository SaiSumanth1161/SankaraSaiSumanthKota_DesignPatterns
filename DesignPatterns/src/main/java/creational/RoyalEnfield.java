package creational;

public class RoyalEnfield implements Bike{
	String name;
	int min_cost,max_cost;
	public RoyalEnfield()
	{
		name="Bajaj";
		min_cost=100000;
		max_cost=250000;
	}
	
	public void getDetails()
	{
		System.out.println("Cost of "+name+" ranges from"+min_cost+" to "+max_cost);
	}	
}

