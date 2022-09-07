package abstractclass;

abstract class Motorbike {
abstract void brake();
}
class SportsBike extends Motorbike{
	public void brake() {
		System.out.println("Sports bike brake");
	}
}

class Mountainbike extends Motorbike{
	public void brake() {
		System.out.println("Mountain bike brake");
	}
}
class main12{
	public static void main(String args[]) {
		Mountainbike m1=new Mountainbike();
		m1.brake();
		SportsBike s1=new SportsBike();
		s1.brake();
	}

}

