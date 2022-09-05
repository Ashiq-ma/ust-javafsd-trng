package Day3;

public class Super_animal {
	public void display() {
		System.out.println("I am an animal");
	}
}
class Dog1 extends Animal{
	public void display() {
		System.out.println("Iam a dog");
	}
	public void printMessage() {
		display();
	
	super.display();
	}
}
class Main8{
	public static void main(String args[]) {
		Dog d1=new Dog();
		d1.printMessage();
	}
}