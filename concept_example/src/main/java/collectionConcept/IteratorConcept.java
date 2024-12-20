package collectionConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorConcept {

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
		
		Iterator it= li.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		List li1=new ArrayList();
		li1.add(null);
		li1.add("1115");
		li1.add('A');
		li.removeAll(li1);
		System.out.println(li);
		
	}

}
