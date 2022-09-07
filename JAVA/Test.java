package interfaceclass;

class Test {
int a;
int b;
Test(){
	this(10,20);
	System.out.println("inside default constructor \n");
}
Test(int a,int b){
	this.a=a;
	this.b=b;
	System.out.println("inside parameterized constructor");
}
public static void main(String args[]) {
	Test object=new Test();
}
}
