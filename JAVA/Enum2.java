package day4set3;
enum Size1{
	SMALL,MEDIUM,LARGE,EXTRALARGE
}
class Test{
	Size1 pizzaSize;
	public Test(Size1 pizzaSize) {
		this.pizzaSize=pizzaSize;
	}
	public void orderPizza() {
		switch(pizzaSize) {
		case SMALL:
			System.out.println("I ordered a small size pizza");
			break;
		case MEDIUM:
			System.out.println("I ordered a small medium pizza");
			break;
			default:
				System.out.println("i dont know which one to order");
				break;
		}
	}
}
 class Enum2 {
	 public static void main(String args[]) {
		 Test t1=new Test(Size1.MEDIUM);
		 t1.orderPizza();
	 }

}
