package collectionAssignment;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQ2 {

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
		System.out.println(li);
		
		
		if(li.contains(null))
		{
		System.out.println("value is null");	
		}
		else
		{
			System.out.println("value is  not null");		
		}
		
		
	}

}
