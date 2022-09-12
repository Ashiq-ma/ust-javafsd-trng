package Sba;

interface  Interfacesba {
	abstract void  calculateSalary(); 
	abstract void fetchDepartment();

}
class Engineer2 implements Interfacesba  {
	public void calculateSalary() {
		System.out.println("salary is zero");
	}
	public void fetchDepartment() {
		System.out.println("Engineer");
	}
	
}
class Doctor1 implements Interfacesba {
	public void calculateSalary() {
		System.out.println("salary is one");
	}
	public void fetchDepartment() {
		System.out.println("doctor");
	}
}
class main34{
	public static void main(String args[]) {
		Engineer2 e=new Engineer2();
		Doctor1 d=new Doctor1();
		e.calculateSalary();
		e.fetchDepartment();
		d.calculateSalary();
		d.fetchDepartment();
	}
}
	
	



