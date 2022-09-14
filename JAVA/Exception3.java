package day4set1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exception3 {
	public static void findFile() throws IOException {
		File newFile=new File("Test.txt");
		FileInputStream stream=new FileInputStream(newFile);
		
		
	}
	public static void main(String args[]) {
		try {
			findFile();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
