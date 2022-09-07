package abstractclass;

abstract class Abstract_animal {
abstract void makeSound();
public void eat() {
	System.out.println("I cany eat");
}
}
class Dog extends Abstract_animal {
	public void makeSound() {
		System.out.println("Bark bark");
	}
	
}
class Main16{
	public static void main(String args[]) {
		Dog d1=new Dog();
		d1.makeSound();
		d1.eat();
	}


	

	
}
