package methodreference;

public class MethodReference4 {
	public void printnMsg() {
		System.out.println("Hello this is an instance method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t2=new Thread(new MethodReference4()::printnMsg);
		t2.start();

	}

}
