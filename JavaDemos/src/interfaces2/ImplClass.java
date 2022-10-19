package interfaces2;

public class ImplClass extends AbstractClass1 implements I1,I2{
	@Override
	public void show() {
		System.out.println("Hi iam from I2");
		
	}
	@Override
	public void display() {
		System.out.println("Hi iam from I1");
		
	}
	@Override
	public void m1() {
		System.out.println("Hi iam from AbstractClass1");
		
	}
	
	

}
