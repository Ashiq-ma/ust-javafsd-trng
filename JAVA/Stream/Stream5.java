package stream;

import java.util.function.Predicate;


public class Stream5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> checkOddEven=x->x%2==0;
		System.out.println("Number 14 is Even"+checkOddEven.test(14));
		System.out.println("Number 18 is Odd"+checkOddEven.test(18));
		System.out.println("Number 21 is Even"+checkOddEven.test(21));
		

	}

}
