package Day3;

public class Animal_type {

	protected String type ="animal";
}
class Dog3 extends Animal_type{
	public String type="mammal";
	public void printType() {
		System.out.println("iam "+type);
		System.out.println("iam an"+super.type);
	}
}
class Main9{
	public static void main(String args[]) {
		Dog3 dog1=new Dog3();
		dog1.printType();
	}
}
