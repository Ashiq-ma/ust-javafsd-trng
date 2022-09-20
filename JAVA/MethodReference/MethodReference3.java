package methodreference;


interface Sayable{
	void say();
}
public class MethodReference3 {
	public static void saySomething() {
		System.out.println("Hello this is static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable sayable=MethodReference3::saySomething;
		sayable.say();

	}

}
