package creational;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Singleton_Design_Pattern {
	List<Integer> t=new ArrayList<Integer>();
	private static Singleton_Design_Pattern obj;
	private Singleton_Design_Pattern(){}
	public static Singleton_Design_Pattern getInstance()
    {
		if(obj==null)
			obj=new Singleton_Design_Pattern();
        return obj;
    }
	public void setData(Integer x)
	{
		t.add(x);
	}
	public void clearData()
	{
		t.clear();
	}
	public void removeData(Integer x)
	{
		if(t.remove(x))
			System.out.println("Element has been deleted");
		else
			System.out.println("Element is not present");
	}
	public void getData()
	{
		System.out.println("Elements in the List are:");
		Iterator<Integer> it=t.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
