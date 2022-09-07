package abstractclass;

public class Language {
	public void display() {
		System.out.println("This is Java programming");
	}

}
class Main extends Language {
	public static void main(String args[]) {
		Main obj=new Main();
		obj.display();
	}
}
