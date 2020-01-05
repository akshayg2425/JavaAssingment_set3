package Assingmentset5;

public class Assingment49 {

	public static void main(String[] args) {

		int n = 27;

		int n1 = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				n1 += i;
			}

		}

		if (n1 == n) {
			System.out.println("Yes! its a perfect no.");
		} else {
			System.out.println("No! its not a perfect no.");
		}

	}

}
