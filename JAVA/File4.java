package day4set2;

import java.io.File;

public class File4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("newfile.txt");
		String[] fileList=file.list();
		for(String str:fileList) {
			System.out.println(str);
		}
	}

}
