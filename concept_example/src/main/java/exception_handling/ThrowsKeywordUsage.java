package exception_handling;

public class ThrowsKeywordUsage {
	
	static void methodA() throws ArithmeticException
	{
		System.out.println("aaaaaaa");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			ThrowsKeywordUsage.methodA();	
		}
		catch(ArithmeticException ae)
		{
			
		}
		
		
		
	}

}
