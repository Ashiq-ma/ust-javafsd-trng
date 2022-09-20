package methodreference;

public class MethodReference2 {
public static void ThreadStatus() {
	System.out.println("Thread is running");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t2=new Thread(MethodReference2::ThreadStatus);
		t2.start();
		

	}

}
