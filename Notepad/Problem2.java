package com.ust;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("input first number");
		double a=s.nextDouble();
		System.out.println("input second number");
		double b=s.nextDouble();
		if(a>0&&a<1) {
			
			if(b>0&&b<1) {
				System.out.println("true");
			}
			else
				System.out.println("false");
		}
		else
			System.out.println("false");

	}

}
