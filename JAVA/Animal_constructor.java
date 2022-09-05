package Day3;

public class Animal_constructor {
	Animal_constructor(){
		System.out.println("Iam an animal");
	}

}
class Dog4 extends Animal{
	Dog4(){
		super();
		System.out.println("Iam a dog");
	}
}
class Main10{
	public static void main(String args[]) {
		Dog4 d1= new Dog4();
	}
}