package Assingmentset5;

public class Assingment44 {

	public static void main(String[] args) {

		int input[] = { 1, 2, 1, 1, 3 };

		int n = 0;

		int max = 0;
		int p1 = 0;
		int p2 = 0;

		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length - 1; j++) {
				if (input[i] == input[j]) {
					n = j;

					if (n - i > max) {
						max = n - i;

						p1 = n;
						p2 = i;
					}

				}
			}

		}

		System.out.println("span is " + (p1 - p2));

	}

}
