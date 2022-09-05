package Day3;

public class Animal_constructor2 {
	Animal_constructor2(){
		System.out.println("Iam an animal");
	}
	Animal_constructor2(String type){
		System.out.println("Type :"+type);
	}

}
class Dog7 extends Animal_constructor2{
	Dog7(){
		super("Animal");
		System.out.println("Iam a dog");
	}
}
class Main11{
	public static void main(String args[]) {
		Dog7 d=new Dog7();
	}
}