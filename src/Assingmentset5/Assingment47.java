package Assingmentset5;

public class Assingment47 {

	public static void main(String[] args) {

		int number = 456789;

		while (number > 10) {
			int n = 0;
			int sum = 0;
			while (number != 0) {
				n = number % 10;

				sum += n;

				number = number / 10;

			}

			System.out.println(sum);
			number = sum;

		}

		System.out.println(number);
	}

}
