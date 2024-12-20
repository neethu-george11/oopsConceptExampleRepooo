package methodOverridingDemo;

public class ClassB extends ClassA{
	
	public void methodA()
	{
		System.out.println("aaaa");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassB obj=new ClassB();
		ClassA obj1=new ClassA();
		obj.methodA();
		obj1.methodA();

	}

}
