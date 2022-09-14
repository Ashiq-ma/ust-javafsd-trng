package thread;

public class Thread3 extends Thread {
	public static void main(String args[]) {
		Thread3 t3=new Thread3();
		try {
			System.out.println("hi");
		
		t3.sleep(300);
		System.out.println("Slept");
		}
		catch(Exception ex) {
			ex.getStackTrace();
		}
	}

}
