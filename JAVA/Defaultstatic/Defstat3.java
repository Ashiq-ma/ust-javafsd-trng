package defstat;


interface Sayable1{
	default void say() {
		System.out.println("Hello this is default method");
	}
	void sayMore(String msg);
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}
public class Defstat3 implements Sayable1 {
	public void sayMore(String msg) {
	System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Defstat3 dm=new Defstat3();
		dm.say();
		dm.sayMore("Work is workship");
		Sayable1.sayLouder("Helloo");

	}

}
