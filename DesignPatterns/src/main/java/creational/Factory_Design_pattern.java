package creational;

import java.util.Scanner;

public class Factory_Design_pattern {
		public static void main(String args[])
		{
			Bike bike=null;
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the Bike brand for the details:\n1)KTM\n2)Bajaj\n3)Royal Enfield");
			int choice=scan.nextInt();
			if(choice==1)
				bike=new KTM();
			else if(choice==2)
				bike=new Bajaj();
			else if(choice==3)
				bike=new RoyalEnfield();
			bike.getDetails();
			scan.close();
		}
}
