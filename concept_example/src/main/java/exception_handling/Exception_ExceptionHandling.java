package exception_handling;

public class Exception_ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s=null;
		
		try
		{
		System.out.println(s.length());
		}
		
		catch(NullPointerException npe)
		{
		System.out.println("Exception Handled");
		System.out.println(npe.getMessage());	
		}
		
		finally
		{
			System.out.println("important code");
		}
	}

}
