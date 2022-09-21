package defstat;


interface Sayable{
	default void say() {
		System.out.println("Hello this is the default method");
	}
	void sayMore(String msg);
		
	
}
public class Defstat2 implements Sayable {
	public void sayMore(String msg) {
		System.out.println(msg);
	}
	public static void main(String args[]) {
		Defstat2 dm=new Defstat2();
		dm.say();
		dm.sayMore("Work is worship");
	}

}
