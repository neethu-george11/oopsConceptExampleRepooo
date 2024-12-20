package collectionConcept;

import java.util.ArrayList;
import java.util.List;

public class ArrayReadSimpleForLoop {

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
		
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		
		

	}

}
