package day4set2;

import java.io.FileReader;

public class File2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array=new char[100];
		try {
			FileReader input=new FileReader("input.txt");
			input.read(array);
			System.out.println("data in the file");
			System.out.println(array);
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}
