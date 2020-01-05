package Assingmentset2;

import java.util.Scanner;

public class Assingment12 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the  input String");

		String s1 = s.nextLine();

		char c = s1.charAt(0);
		char c1 = s1.charAt(s1.length() - 1);

		String s2 = s1.substring(1, (s1.length() - 1));

		String s3 = new String();

		s3 = c1 + s2 + c;

		System.out.println('"' + s3 + '"');

	}

}
