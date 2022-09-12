package Sba;

abstract class Abstractsba {
	abstract void  calculateSalary(); 
	abstract void fetchDepartment();
}
class Engineer1 extends Abstractsba {
	public void calculateSalary() {
		System.out.println("salary is zero");
	}
	public void fetchDepartment() {
		System.out.println("Engineer");
	}
	
}
class Doctor extends Abstractsba {
	public void calculateSalary() {
		System.out.println("salary is one");
	}
	public void fetchDepartment() {
		System.out.println("doctor");
	}
}
class main33{
	public static void main(String args[]) {
		Engineer1 e=new Engineer1();
		Doctor d=new Doctor();
		e.calculateSalary();
		e.fetchDepartment();
		d.calculateSalary();
		d.fetchDepartment();
	}
}
	
	


