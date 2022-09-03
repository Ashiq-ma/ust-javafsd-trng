package com.ust;

public class SwitchExample {
	public static void main(Vowels args[]) {
		String str="green1";
		switch(str) {
		case"red":
			System.out.println("Iam in red");
			System.out.println("**");
		case"green":
			System.out.println("Iam in green");
			System.out.println("*");
			break;
		case"blue":
			System.out.println("Iam in blue");
			System.out.println("*");
			
		default:
			System.out.println("default");
			
		}
		
	}

}
