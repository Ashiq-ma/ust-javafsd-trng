package thread;
enum Signal{
	Red(5),orange(10),green(15);
	private int x;
	private Signal(int x) {
		this.x=x;
	}
	
	int getIndex() {
		return x;
	}

}
public class Enum {
	public static void main(String args[]) {
		Signal s=Signal.green;
		
		System.out.println(Signal.green.getIndex());
		System.out.println(s.name());
		System.out.println(s.compareTo(s));
		System.out.println(s.valueOf("Red"));
	}
	

}
