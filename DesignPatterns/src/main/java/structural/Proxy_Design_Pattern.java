package structural;

import java.util.Scanner;

public class Proxy_Design_Pattern {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name of the document:");
		String doc=scan.next();
		File file=new DupFile(doc);
		file.copy();
		System.out.println(" ");
		file.copy();
		scan.close();
	}
}
