package Behavioural;

public class Subtract implements Calculator{

	public void calculation(int a, int b) {
		
		System.out.println("Subtraction of "+a+" + "+b+": "+ Math.abs(a-b));
	}

}