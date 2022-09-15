package innerclass;

public class Outer {
	class Inner1{
		void display() {
			System.out.println("inner class");
		}
	}
	public static void main(String args[]) {
		Inner1 i=new Outer().new Inner1();
		i.display();
	}

}
