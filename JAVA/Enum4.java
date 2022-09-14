package day4set3;

public class Enum4 {
enum Position{
	Reema("Panda").Himanshu("Bhardwa").Geetanjali("Sharma");
	String iName;
	Position(String s){
		iName=s;
	}
	String showPosition() {
		return iName;
	}
}
public static void main(String args[]) {
	for(Position pos:Position.values()) {
		int val=pos.ordinal()+1;
		System.out.println("First="+pos+"\nLast name="+pos.showPosition()+"\nPosition in class="+val);
	System.out.println();}
}
}
