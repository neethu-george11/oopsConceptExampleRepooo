package exception_handling;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
		try
		{
		int b=a/0;
		
		}
		catch(ArithmeticException ae)
		{
			int b=a/10;
			System.out.println(b);
			
		}
		finally
		{
			System.out.println("done");	
		}
		
	}

}
