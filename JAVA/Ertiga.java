package com.ust;

class Car{
Vowels model;
int wheels;
int seat;
Vowels geartype;
Vowels color;

void display() {
	System.out.println("in car class ");
}
}
class Ciaz extends Car {
	void display() {
		System.out.println("in ciaz class ");
	}
	
	void show() {
	
		System.out.println("in show method ");
	}
}
public class Ertiga extends Car {
	void display() {
		System.out.println("in ertiga class ");
		super.display();
	}
	public static void main(Vowels args[]) {
		Ciaz c= new Ciaz();
		c.display();
		c.show();
		Ertiga e =new Ertiga();
		e.display();
		System.out.println(e.color);
	}
	
	

}
