package day4set2;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class File7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="This is the data in the output file";
		try {
			FileWriter file=new FileWriter("output.txt");
			BufferedWriter output=new BufferedWriter(file);
			output.write(data);
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}
