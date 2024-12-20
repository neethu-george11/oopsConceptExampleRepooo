package interfaceExample;

public class InterfaceProgramAClass implements InterfaceProgramA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceProgramAClass obj=new InterfaceProgramAClass();//create object of child class & access all methods
		obj.methodA();
		obj.methodC();
		InterfaceProgramA.methodB();//static method created inside the interface..so interface name.methodname

	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
	
		
	}

}
