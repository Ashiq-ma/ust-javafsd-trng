package day4set2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class File8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream  file=new FileInputStream("input.txt");
			BufferedInputStream input=new BufferedInputStream(file);
			int i=input.read();
			while(i!=-1) {
				System.out.println((char)i);
				i=input.read();
			}
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}
