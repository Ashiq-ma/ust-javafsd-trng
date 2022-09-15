package innerclass;

public class MethodLocal {
	void display() {
		int x=5;
		
		class MethodInner{
			void display1() {
				System.out.println("in method local");
			}
		}
		MethodInner i=new MethodInner();
		i.display1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodLocal m=new MethodLocal();
		m.display();
		System.out.println("calling outer method");

	}

}
