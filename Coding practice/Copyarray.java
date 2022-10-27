


import java.util.*;
public class Copyarray{
	public static void main(String args[]){
		
		Scanner s=new Scanner(System.in);
		int arr[]=new int[10];
		int arr2[]=new int[10];
		for(int i=0;i<5;i++){
		arr[i]=s.nextInt();
		}
		for(int i=0;i<5;i++){
		arr2[i]=arr[i];
		}
		for(int i=0;i<5;i++){
		System.out.print(arr2[i]+",");
		}
	}
}