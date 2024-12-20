package exception_handling;

public class CustomExceptionSample {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		
		int age=10;
		if(age>18)
		{
		System.out.println("elgible");	
		}
		else
		{
		throw new VotingException("not elgible");
		}

	}

}
