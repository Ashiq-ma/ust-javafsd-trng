package functionalinterface;



class Functinter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(()->{
			System.out.println("New thread created");
		}).start();

	}

}
