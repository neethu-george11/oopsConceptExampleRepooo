package collectionConcept;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List li=new ArrayList();
		
		li.add("neethu");
		li.add("George");
		li.add("1115");
		li.add(null);
		li.add('A');
		li.add(null);
		li.add('A');
		
		for(Object x:li)
		{
			System.out.println(x);
		}

	}

}
