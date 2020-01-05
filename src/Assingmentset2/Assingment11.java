package Assingmentset2;

import java.util.Scanner;

public class Assingment11 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the input string");

		String i = s.nextLine();

		int n = 0;

		String s1 = "";

		for (int j = 0; j < i.length(); j++) {

			s1 = s1 + i.charAt(j);

			j++;

			if (j > i.length()) {
				break;
			}

		}

		System.out.println('"' + s1 + '"');

	}

}
