package com.ust;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<4;i++) {
			arr[i]=s.nextInt();
			
		}
		if(arr[0]==arr[1]&&arr[2]==arr[3]) {
			if(arr[1]==arr[3]) {
				System.out.println("same");
			}
			
			
		}
		else {
			System.out.println("not same");
		}

	}

}
