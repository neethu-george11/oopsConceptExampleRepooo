package exception_handling;

public class ThrowExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we are throwing an  exception
		int age=10;
		if(age>18)
		{
			System.out.println("Elgible for voting");
		}
		else
		{
		throw new ArithmeticException("not elgible");	
		}

	}

}
