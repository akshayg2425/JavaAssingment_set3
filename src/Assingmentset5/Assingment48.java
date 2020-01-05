package Assingmentset5;

import java.time.Year;
import java.util.Calendar;

public class Assingment48 {

	public static void main(String[] args) {

		String year = "2020";

		int n = Integer.parseInt(year);

		Year ryear = Year.of(n);

		System.out.println(ryear.isLeap());

	}

}
