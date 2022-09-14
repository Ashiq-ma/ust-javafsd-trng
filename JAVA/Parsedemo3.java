package day4set3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parsedemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date="14/10/2020";
		LocalDate localDate=LocalDate.parse(date,formatter);
		System.out.println("parsed local date"+localDate);
		
		System.out.println("formatted lovcal date:"+formatter.format(localDate));

	}

}
