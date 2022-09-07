package interfaceclass;

interface A {
void funcA();
}
interface B extends A{
	void funcB();
}
class D implements B{
	public void funcA() {
		System.out.println("This is funcA");
	}
	public void funcB() {
		System.out.println();
	}
}
public class Demo1{
	public static void main(String args[]) {
		D obj=new D();
		obj.funcA();
		obj.funcB();
	}
}