package defstat;


interface TestInterface{
	public void square(int a);
	default void show() {
		System.out.println("Default method executed");
	}
}

class Defstat1 implements TestInterface{
	public void square(int a) {
		System.out.println(a*a);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Defstat1 d=new Defstat1();
	d.square(4);
	d.show();

	}

}
