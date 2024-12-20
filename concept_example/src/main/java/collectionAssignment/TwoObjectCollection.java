package collectionAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoObjectCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List s1=new ArrayList();
		
		s1.add("aa");
		s1.add("bb");
		s1.add("cc");
		s1.add("xx");
		s1.add("yy");
		
		List s2=new ArrayList();
		s2.add("xx");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.containsAll(s2));
		
		
		

	}

}
