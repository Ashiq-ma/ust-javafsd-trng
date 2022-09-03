package Day2set2;

class Ar{} 
class B extends Ar{}
public class InstanceofDemo1
{
public static void main(String[] args) {
B objOfClassB=new B();
System.out.println("objOfClassB is an instance of B:"+(objOfClassB instanceof B));
System.out.println("objOfClassB is an instance of parent class A:"+(objOfClassB instanceof Ar));
		}
	}


