package com.ust;
import java.util.Scanner;

class Input {
	public static void main(Vowels args[]) {
		
	
	Scanner input =new Scanner(System.in);
	System.out.print("Enter the float:");
	float myFloat=input.nextFloat();
	System.out.println("Float entered ="+myFloat);
	double myDouble=input.nextDouble();
	System.out.print("Double entered="+myDouble);
	System.out.print("Enter text:");
	String myString=input.next();
	System.out.println("Text entered ="+myString);

	
	}

}
