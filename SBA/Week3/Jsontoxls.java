package Sba;

import java.io.FileOutputStream;
import java.io.FileReader;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Jsontoxls {
	public static void main(String args[]) {
		JSONParser p=new JSONParser();
		try {
			FileReader f=new FileReader("C:\\Users\\ustjavafsdb214\\Downloads\\EmployeeData.json");
			JSONArray arr=(JSONArray)p.parse(f);
			FileOutputStream ofile=new FileOutputStream("C:\\Users\\ustjavafsdb214\\Downloads\\Employ.xls");
			
			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet s1 = wb.createSheet("Sheet1");
			
			String arra1[] = {"ID","NAME","EMAIL","PASSWORD","ABOUT","TOKEN","COUNTRY","LOCATION","LONGITUDE","LATITUDE","DOB","GENDER"};
			Row r0 = s1.createRow(0);
			Cell c1;
			for(int i=0;i<12;i++) {
				c1 = r0.createCell(i);
				c1.setCellValue(arra1[i]);
				
			}
			
			for(int i=0;i<arr.size();i++) {
				JSONObject obj=(JSONObject)arr.get(i);
				long id=(long)obj.get("id");
				String name=(String)obj.get("name");
				
				String email=(String)obj.get("email");
				String password=(String)obj.get("password");
				String about=(String)obj.get("about");
				String token=(String)obj.get("token");
				String country=(String)obj.get("country");
				String location=(String)obj.get("location");
				long lat=(Long)obj.get("lat");
				long lng=(Long)obj.get("lng");
				String dob=(String)obj.get("dob");
				long gender=(Long)obj.get("gender");
				Row rh = s1.createRow(i+1);
				Cell ch1;
				ch1 = rh.createCell(0);
				ch1.setCellValue(id);
				ch1 = rh.createCell(1);
				ch1.setCellValue(name);
				ch1 = rh.createCell(2);
				ch1.setCellValue(email);
				ch1 = rh.createCell(3);
				ch1.setCellValue(password);
				ch1 = rh.createCell(4);
				ch1.setCellValue(about);
				ch1 = rh.createCell(5);
				ch1.setCellValue(token);
				ch1 = rh.createCell(6);
				ch1.setCellValue(country);
				ch1 = rh.createCell(7);
				ch1.setCellValue(location);
				ch1 = rh.createCell(8);
				ch1.setCellValue(lng);
				ch1 = rh.createCell(9);
				ch1.setCellValue(lat);
				ch1 = rh.createCell(10);
				ch1.setCellValue(dob);
				ch1 = rh.createCell(11);
				ch1.setCellValue(gender);
						
				
			}
			wb.write(ofile);
			
			ofile.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
