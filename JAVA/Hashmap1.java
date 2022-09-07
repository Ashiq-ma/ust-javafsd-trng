package Set5;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {
	public static void main(String args[]) {
		Map<String,Integer> numbers=new HashMap<>();
		numbers.put("One",1);
		numbers.put("Two",2);
		System.out.println("Map using TreeMap:"+numbers);
		System.out.println("keys"+numbers.keySet());
		System.out.println("values"+numbers.values());
		System.out.println("Entries"+numbers.entrySet());
		int value=numbers.remove("Two");
		System.out.println("Removed Value"+value);
}
}
