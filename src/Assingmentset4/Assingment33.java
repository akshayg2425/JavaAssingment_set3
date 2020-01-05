package Assingmentset4;

public class Assingment33 {

	public static void main(String[] args) {

		String one = "akshay";

		int z = 0;
		int z1 = 0;
		int z2 = 0;
		int z3 = 0;
		int z4 = 0;

		for (int i = 0; i < one.length(); i++) {
			char c = one.charAt(i);

			if (c == 'a' || c == 'A') {
				z = 1;
			}

			else if (c == 'e' || c == 'E') {
				z1 = 1;
			}

			else if (c == 'i' || c == 'I') {
				z2 = 1;
			}

			else if (c == 'o' || c == 'O') {
				z3 = 1;
			}

			else if (c == 'u' || c == 'U') {
				z4 = 1;
			}

		}
		if (z == 1 && z1 == 1 && z2 == 1 && z3 == 1 && z4 == 1) {
			System.out.println(1);
		} else {
			System.out.println(2);

		}
	}

}
