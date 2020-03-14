package creational;

public class KTM implements Bike{
	String name;
	int min_cost,max_cost;
	public KTM()
	{
		name="Bajaj";
		min_cost=90000;
		max_cost=200000;
	}
	
	public void getDetails()
	{
		System.out.println("Cost of "+name+" ranges from"+min_cost+" to "+max_cost);
	}	
}

