package Day3;

public class Animal {
	public void display() {
		System.out.println("I am an animal");
	}

}
class Dog extends Animal{
	@Override
	public void display() {
		System.out.println("Iam a dog");
	}
	public void printMessage() {
		display();
	}

}
class Main7{
	public static void main(String args[]) {
		Dog dog1=new Dog();
		dog1.printMessage();
	}
}