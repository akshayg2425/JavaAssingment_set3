package Assingmentset4;

public class Assingment38 {

	public static void main(String[] args) {

		int[] input1 = { 2, 4, 3, 5, 6 };

		int sum = 0;

		for (int i = 0; i < input1.length; i++) {
			if (i % 2 != 0) {
				sum = sum + (input1[i] * input1[i]);

			}

			else {
				sum = sum + (input1[i] * input1[i] * input1[i]);
			}
		}

		System.out.println(sum);

	}

}
