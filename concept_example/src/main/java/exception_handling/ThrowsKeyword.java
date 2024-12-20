package exception_handling;

public class ThrowsKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("aaaaa");
		System.out.println("bbbbbbbbbbb");
		try
		{
			Thread.sleep(5000);	
		}
		catch(InterruptedException e)
		{
			System.out.println("exception handled");
		}
		
		System.out.println("ccccc");
		System.out.println("dddddd");
	}

}
