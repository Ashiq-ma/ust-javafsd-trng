package foreach;

import java.util.ArrayList;
import java.util.List;

public class Foreach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> gamesList=new ArrayList<String>();
		gamesList.add("football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hockey");
		System.out.println("iterating by passing method reference");
		gamesList.forEach(System.out::println);

	}

}
