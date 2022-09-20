package foreach;

import java.util.ArrayList;
import java.util.List;

public class Foreach1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> gamesList=new ArrayList<String>();
		gamesList.add("football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hockey");
		System.out.println("iterating by passing lambda expression");
		gamesList.forEach(games->System.out.println(games));
				

	}

}
