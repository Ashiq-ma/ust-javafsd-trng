package Day3;

class This_test {
int val1;
int val2;

This_test(int val1,int val2){
	this.val1=val1+val2;
	this.val2=val2+val2;
}
void display() {
	System.out.println("Value val="+val1+"Value val2="+val2);
}
}
	

class Main
{
	public static void main(String[] args)
	{
		This_test object=new This_test(5,10);
		object.display();
	}
}