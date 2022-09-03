package Sba;

public class Employee {
	int salary=100;
	int exp=2;
	String name;
	void salary() 
	{
		System.out.println(salary);
	    
		
	}
	void salary(int exp) {
		
			System.out.println("The employee with exp "+exp+" has salary "+salary);
		}
	
public static void main(String args[]) {
	
		Employee e=new Employee();
		e.salary();
		Engineer e2=new Engineer();
		e2.salary();
		Engineer e3=new Engineer();
		e3.salary(3);
	}



	}

class Engineer extends Employee{
	void salary()
	{
		salary=300;
		System.out.println("The engineer salary is "+salary);
		super.salary();
	}
	
	
}
