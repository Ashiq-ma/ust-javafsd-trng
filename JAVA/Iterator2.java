package Set5;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator2 {
public static void main(String args[]) {
	ArrayList<Integer> numbers=new ArrayList<>();
	numbers.add(1);
	numbers.add(3);
	numbers.add(2);
	System.out.println("ArrayList"+numbers);
	Iterator<Integer> iterate=numbers.iterator();
	int number=iterate.next();
	System.out.println("Accessed element"+number);
	iterate.remove();
	System.out.println("Removed element"+number);
	System.out.println("Updated arrayList");
	while(iterate.hasNext()) {
		iterate.forEachRemaining((value)->System.out.print(value+"."));
		
	}
}
}
