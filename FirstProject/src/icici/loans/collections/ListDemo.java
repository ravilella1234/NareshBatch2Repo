package icici.loans.collections;

import java.util.ArrayList;

public class ListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Object> a = new ArrayList<Object>();
		a.add(10);
		a.add("ravi");
		a.add(13.34f);
		a.add(10);
		a.add(20);
		
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a.get(1));
		System.out.println(a.contains("kiran"));
		
		a.add(30);
		System.out.println(a);
		
		a.add(1, "naresh");
		System.out.println(a);
		
		a.set(2, "ravikanth");
		System.out.println(a);
		
		System.out.println(a.indexOf("naresh"));
		
		System.out.println(a.subList(1, 5));
		
		a.remove(1);
		System.out.println(a);
		
		a.remove("ravikanth");
		System.out.println(a);
		
		a.clear();
		System.out.println(a);

	}

}
