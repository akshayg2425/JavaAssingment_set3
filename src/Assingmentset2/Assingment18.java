package Assingmentset2;

public class Assingment18 {

	public static void main(String[] args) {

		String input1 = "soooooo";
		String input2 = "soo";

		// System.out.println("ERROR IN INPUTT");

		int c = input2.length();

		String s1 = "";

		if (c == 3) {
			for (int i = 0; i < c - 1; i++) {
				s1 = s1 + input1.substring(0, c);
			}
		}

		else if (c == 2) {
			for (int i = 0; i < c + 1; i++) {
				s1 = s1 + input1.substring(0, c);
			}
		}

		System.out.println(s1);

	}

}
