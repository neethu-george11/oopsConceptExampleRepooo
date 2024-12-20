package interfaceExample;

public interface InterfaceProgramA {
	
	int a=100;//variables -static final
	
	//abstract method allowed
	public void methodA();
	
	//static method allowed
	public static void methodB()
	{
		
	}
	
	//default method also allowed
	default void methodC()
	{
		
	}
	
	
}
