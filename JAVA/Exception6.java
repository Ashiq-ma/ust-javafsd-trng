package day4set1;

import java.io.BufferedReader;
import java.io.FileReader;

public class Exception6 {
	public static void main(String args[]) {
		String line;
		try(BufferedReader br=new BufferedReader(new FileReader("Test"))){
			while((line=br.readLine())!=null){
				System.out.println("Line=>"+line);
			}
			
			
		}catch(Exception e) {
			System.out.println("Ioexception in try block=>"+e.getMessage());
			
		}
	}

}
