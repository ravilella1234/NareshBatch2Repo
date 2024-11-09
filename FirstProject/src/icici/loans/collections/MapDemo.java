package icici.loans.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		//HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		//LinkedHashMap<Integer, Integer> h = new LinkedHashMap<Integer, Integer>();
		TreeMap<Integer, Integer> h = new TreeMap<Integer, Integer>();
		h.put(10, 100);
		h.put(200, 200);
		h.put(30, 200);
		h.put(1, 300);
		h.put(40, 400);
		
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.get(10));
		Set<Integer> keys = h.keySet();
		for(Integer key:keys)
		{
			//if(key.equals(10))
			System.out.println(key + "---"+ h.get(key));
		}
	}

}
