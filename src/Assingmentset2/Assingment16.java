package Assingmentset2;

public class Assingment16 {

	public static void main(String[] args) {

		int[] input = { 1, 2, 1, 3, 4, 5, 8 };
		boolean b = false;

		for (int i = 0; i < input.length; i++) {
			if (input[i] == 1 && i <= (input.length - 2) && input[i + 1] == 2 && input[i + 2] == 3) {

				b = true;

			}

		}

		if (b == true) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
