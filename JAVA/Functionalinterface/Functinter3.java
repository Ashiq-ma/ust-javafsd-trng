package functionalinterface;

@FunctionalInterface
interface Square{
	int calculate(int x);
}
class Functinter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		Square s=(int x)->x*x;
		int ans=s.calculate(a);
		System.out.println(ans);

	}

}
