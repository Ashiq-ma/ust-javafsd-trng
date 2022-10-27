import java.util.*;


public class Stringtoarray{
	public static void main(String args[])throws Exception{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array: ");
		int arr[]=new int[4];
		for(int i=0;i<4;i++)
		{
		arr[i]=s.nextInt();
		}
		String a;
		a=Arrays.toString(arr);
		System.out.print(a+",");


}
}
