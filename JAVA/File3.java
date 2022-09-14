package day4set2;

import java.io.File;

public class File3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("file.txt");
		boolean value=file.delete();
		if(value) {
			System.out.println("The file is deleted");
		}
		else {
			System.out.println("The file is not deleted");
		}
	}

}
