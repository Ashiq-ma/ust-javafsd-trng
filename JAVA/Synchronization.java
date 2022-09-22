package thread;

public class Synchronization extends Thread {

	public static void main(String[] args) {
		
		Synchronization t1=new Synchronization();
		t1.start();
		Synchronization t2=new Synchronization();
		t2.start();
	}
		public void run() {
			synchronized(this){
				System.out.println("in synchronized");
			}
			System.out.println("Thread is started");
			System.gc();
			
			
		
		

	}

}
