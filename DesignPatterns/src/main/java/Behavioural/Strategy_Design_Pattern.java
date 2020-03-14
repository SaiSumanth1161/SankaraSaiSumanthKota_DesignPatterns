package Behavioural;

import java.util.Scanner;

public class Strategy_Design_Pattern {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two values:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		Calculate add = new Calculate(new Addition());		
	    add.calculate(a,b);
	    Calculate divide = new Calculate(new Division());		
	    divide.calculate(a,b);
	    Calculate subtract = new Calculate(new Subtract());		
	    subtract.calculate(a,b);
	    
	    scan.close();
	}

}
