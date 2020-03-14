package Behavioural;

public class Calculate {
	public Calculator calculate;
	Calculate(Calculator calculate)
	{
		this.calculate=calculate;		
	}
	public void calculate(int a,int b)
	{
		calculate.calculation(a, b);		
	}

}
