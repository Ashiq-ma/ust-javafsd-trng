package com.ust;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		boolean arr1[][]=new boolean[3][3];
		try {
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				
		arr1[i][j]=s.nextBoolean();
		
			}
		}
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				if(arr1[i][j]==true) {
					System.out.println("t");
				}
				
					
				else {
					System.out.println("f");
				}
			}

	}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
