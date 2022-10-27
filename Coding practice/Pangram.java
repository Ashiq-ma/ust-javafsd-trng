import java.util.*;

public class Pangram{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		

	Set <Character> set=new HashSet<>();
	String str=s.nextLine();
	for(int i=0;i<str.length();i++)
	{
	if(str.charAt(i)==' ')
	continue;

	set.add(str.toLowerCase().charAt(i));

}

System.out.println(set);

if(set.size()==26){
System.out.println("Pangram");
}
else
System.out.println("Not");


}
}

	