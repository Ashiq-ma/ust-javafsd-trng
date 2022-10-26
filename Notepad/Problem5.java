package com.ust;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a;
		int index;
		System.out.println("Ente the string : ");
		a=s.nextLine();
		System.out.println("Ente the index : ");
		index=s.nextInt();
		char c=a.charAt(index);
		System.out.println(c);

	}

}
