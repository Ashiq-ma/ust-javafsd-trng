package Day3;

final class Finalclass {
	
		public void display() {
			System.out.println("This is final class");

			   
		}
	}
class Main17 extends Finalclass
{
	public void display() {
		System.out.println("The method is overrideen");
	}
	public static void main(String args[]) {
		Main17 obj=new Main17();
		obj.display();
	}
}
