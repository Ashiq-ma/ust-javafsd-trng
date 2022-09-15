package innerclass;
//anonymous class example

abstract class Animal{
	abstract void sound();
}
public class Namelessclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal() {
		void sound() {
			System.out.println("Animal sound");
			}	
	};
	a.sound();
	}

}
