package methodreference;

import java.awt.List;
import java.util.ArrayList;

public class Methodreference1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList names=new ArrayList();
		names.add("Mahesh");
		names.add("Arun");
		names.add("rameesh");
		names.add("Suresh");
		
		names.forEach(System.out::println);

	}

}
