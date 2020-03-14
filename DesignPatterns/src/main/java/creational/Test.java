package creational;

import java.util.Scanner;

public class Test {
	public static void main(String args[])
	{
		Singleton_Design_Pattern h=Singleton_Design_Pattern.getInstance();
		Scanner s=new Scanner(System.in);
		int n,i;
		System.out.println("Number of elements:");
		n=s.nextInt();
		int x;
		for(i=0;i<n;i++)
		{
			x=s.nextInt();
			h.setData(x);
		}
		h.getData();
		System.out.println("Enter the element to be deleted:");
		x=s.nextInt();
		h.removeData(x);
		h.getData();
		s.close();
	}

}
