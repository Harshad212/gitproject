package git.com;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agit {
public static void main(String[] args) {
	
	
	List al = new ArrayList();
     al.add(10);
	al.add(20);
	al.add(30);
	al.add("abc");
	al.add("pqr");
	int x =(int) al.get(1);
	System.out.println(x);
	
	
	
	Iterator itr =al.iterator();
	while(itr.hasNext());
	{
		int x1 =(int)itr.next();
		System.out.println(x1);
		
	}
	
	Object o = itr.next();
	if(o instanceof Integer)
	{
		int x2 =(int)o;
		System.out.println(x2);
	}
	else
		if( o instanceof String)
	{
		String x3 =(String) o;
		System.out.println(x3);
	}
}
}


