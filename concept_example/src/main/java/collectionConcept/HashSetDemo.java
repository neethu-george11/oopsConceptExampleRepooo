package collectionConcept;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//HashSet h=new HashSet();	
		Set se=new HashSet();
		se.add("aaaa");
		se.add(100);
		se.add("aaaa");
		se.add(10.6);
		se.add(null);
		se.add(null);
		
		//printing HashSet
		System.out.println(se);
		int a=30;
		if(se.contains(a))
		{
			System.out.println("contains value");	
		}
		else
		{
			System.out.println("not contains the value");
		}
		
		
		
		
		
		
	}

}
