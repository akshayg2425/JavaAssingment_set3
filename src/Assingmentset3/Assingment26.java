package Assingmentset3;

public class Assingment26 {

	public static void main(String[] args) {

		String input = "020110331111";

		int sum = 0;

		int cal = 10;

		for (int i = 0; i < input.length(); i++) {
			int n = Integer.parseInt(input.valueOf(input.charAt(i)));

			System.out.println(n);

			sum = sum + (n * cal);

			System.out.println(sum);

			cal--;

			System.out.println(cal);
		}

		if (sum % 11 == 0) {
			System.out.println("It is ISBN No.");
		} else {
			System.out.println("It is not ISBN No.");
		}

	}

}
