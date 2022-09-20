package functionalinterface;

@FunctionalInterface
interface sayable{
	void say(String msg);
	int hashCode();
	String toString();
	boolean equals(Object obj);
}
public class Functinter1 implements sayable{
	public void say(String msg) {
		System.out.println(msg);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functinter1 fie=new Functinter1();
		fie.say("Hello there");

	}

}
