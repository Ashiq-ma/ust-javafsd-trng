package com.ust;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int arr1[][]=new int[3][3];
		try {
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				
		arr1[i][j]=s.nextInt();
		
			}
		}
			for(int j=0;j<3;j++) {
				for(int i=0;i<2;i++) {
					
			System.out.println(arr1[i][j]);
			
				}

	}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

}
}
