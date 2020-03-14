package structural;

public class MainFactory {
	public  Vegatable carrot;
	public  Vegatable brinjal;

	MainFactory()
	{
		carrot=new Carrot();
		brinjal=new Brinjal();
	}
	public void carrotcost()
	{
		carrot.cost();
		
	}
	public void brinjalcost()
	{
		brinjal.cost();
	}

}
