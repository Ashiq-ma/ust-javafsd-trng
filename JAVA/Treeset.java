package Set5;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
	public static void main(String args[]) {
		TreeSet<Integer> numbers=new TreeSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("Treeset"+numbers);
		Iterator<Integer> iterate=numbers.iterator();
		System.out.println("treeset using iterator");
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
			System.out.println(",");
		}
	}

}
