package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	int id;
	String name;
	int age;
	public Student(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
public class Stream7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(11,"Jon",22));
		studentList.add(new Student(22,"Steve",18));
		studentList.add(new Student(33,"Lucy",22));
		studentList.add(new Student(44,"Sansa",23));
		studentList.add(new Student(55,"Maggie",18));
		List<String> names=studentList.stream().map(n->n.name).collect(Collectors.toList());
		System.out.println(names);
		

	}

}
