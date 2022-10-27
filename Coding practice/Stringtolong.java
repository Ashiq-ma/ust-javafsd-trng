import java.util.*;

public class Stringtolong{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String: ");
		
		String a;
		a=s.nextLine();
		Long l=a.toLong();
		System.out.print(l);


}
}