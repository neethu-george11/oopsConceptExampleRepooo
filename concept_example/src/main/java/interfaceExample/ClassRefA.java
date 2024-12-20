package interfaceExample;

public class ClassRefA implements InterfaceRefA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceRefA obj=new ClassRefA();
		obj.methodA();
		obj.methodC();
		
		InterfaceRefA.methodB();
		
	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}

}
