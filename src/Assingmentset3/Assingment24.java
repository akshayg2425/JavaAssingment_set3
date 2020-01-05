package Assingmentset3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Assingment24 {

	public static void main(String[] args) throws ParseException {

		String ip1 = "2015";
		String ip2 = "5";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

		Date d1 = sdf.parse(ip1);

		Date d2 = new Date();

		@SuppressWarnings("deprecation")
		int n1 = d1.getYear();

		int n2 = d2.getYear();

		int n3 = Integer.parseInt(ip2);

		if ((n2 - n1) > n3) {
			System.out.println(true);
		} else {
			System.out.println("NO");
		}

	}

}
