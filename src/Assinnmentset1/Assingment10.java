package Assinnmentset1;

import java.util.Scanner;

public class Assingment10 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] a = new int[3];

		int sum = 0;
		System.out.println("Enter the values ");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();

		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 13) {
				i = i + 2;

				if (i == 2 && (a.length == 3)) {
					sum = sum + a[i];
				}

				if (i >= a.length) {
					/*
					 * try { if( i < a.length) {
					 * 
					 * }
					 * 
					 * } catch (Exception e) { // TODO Auto-generated catch block
					 * System.out.println("end"); }
					 */
					break;
				}

			}

			else {

				sum = sum + a[i];
			}

		}

		System.out.println(sum);

	}

}
