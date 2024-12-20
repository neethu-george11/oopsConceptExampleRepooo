package collectionConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//store different type of data-hetrogenous data	
	ArrayList arr=new ArrayList();
	//List mylist=new ArrayList();-child class object- can hold in parent class variable
	
	//To Add data to ArrayList
	arr.add(100);
	arr.add(100.8);
	arr.add(10.90);
	arr.add("welcome");
	arr.add('r');
	arr.add(100);
	arr.add(null);
	arr.add(null);
	
	//to find size of ArrayList
	arr.size();
	
	//printing arraylist-specify name of arraylist
	System.out.println(arr);
	
	arr.remove(5);
	System.out.println(arr);
	
	arr.add(4, "added");
	System.out.println(arr);
	
	arr.set(7,'n');
	System.out.println(arr);
	
	System.out.println(arr.get(6));
	
	//reading all elements from ArrayList
	//using normal for loop
	for(int i=0;i<arr.size();i++)
	{
		System.out.println(arr.get(i)); ;
	}
	
	//for each loop/enhanced for loop
	for(Object x:arr)
	{
		System.out.println(x);
	}
	
	//using iterator -specific to arraylist
	Iterator it=arr.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	//access specific element from arraylist
	
	//store same type of data
	//ArrayList<String> li=new ArrayList<String>();
	
	//Employee class-can store multiple emp1,emp2 data
	//ArrayList<Employee> li=new ArrayList<Employee>();
	arr.set(2, "yellow");
	arr.set(4, "yellow");
	System.out.println(arr);
	arr.indexOf("yellow");
	System.out.println(	arr.indexOf("yellow"));
	
	System.out.println(	arr.lastIndexOf("yellow"));
	
	System.out.println(arr.get(2));
	arr.contains("yellow");
	
	arr.size();
	

	}

}
