package Assinnmentset1;

import java.util.Scanner;

public class Assingment5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values upto four");
		int x1 = s.nextInt();
		int x2 = s.nextInt();
		int y1 = s.nextInt();
		int y2 = s.nextInt();

		double op = Math.sqrt(((x1 + x2) * (x1 + x2)) + ((y1 + y2) * (y1 + y2)));

		System.out.println(op);
		System.out.println(Math.round(op));

	}

}
