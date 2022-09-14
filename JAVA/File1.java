package day4set2;

import java.io.File;

public class File1 {
	public static void main(String args[]) {
		File file=new File("newfile.txt");
		try {
			boolean value=file.createNewFile();
			if(value) {
				System.out.println("The new file is created");
			
			}
			else{
				System.out.println("The file already exists");
			}
	}
catch(Exception e) {
	e.getStackTrace();
}
}
}
