package Day2set2;
class Fruits{}
class Vehicle{}
public class InstanceofDemo2 {
public static void main(String args[])
{
	Fruit apple=new Fruit();
	Vehicle car =new Vehicle();
	System.out.println("car is a Fruit:"+(car instanceof Vehicle));
}
}
