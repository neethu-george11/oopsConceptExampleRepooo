package exception_handling;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		try
		{
		System.out.println("enter position b/w 0 to 4");
		int position=sc.nextInt();
		
		System.out.println("enter value");
		int value=sc.nextInt();
		
		a[position]=value;
		
		System.out.println(a[position]);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
	}

}
