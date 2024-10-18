package git.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Bgit {


public static void main(String[] args) {
	
	Map <Integer,String> h = new  HashMap<>();
	h.put(1, "abc");
	h.put(2, "pqr");
	h.put(3, "xyz");
	
	
	System.out.println(h);
	
	Set<Integer> key = h.keySet();
	System.out.println(key);
	System.out.println("using for each");
	for(int keys:key)
	{
		System.out.println(keys);
		String val = h.get(keys);
		System.out.println(val);
	}
	System.out.println("using iterator");
	Iterator itr = key.iterator();
	
	while(itr.hasNext())
	{
		Integer s = (Integer)itr.next();
		System.out.println(s);
		
		String value = h.get(s);
		System.out.println(value);
	}
}
}
