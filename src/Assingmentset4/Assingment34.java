package Assingmentset4;

public class Assingment34 {

	public static void main(String[] args) {

		String input = "forget";

		String s = "";

		String s1 = "";

		if (input.length() % 2 != 0) {
			for (int i = 0; i < input.length() - 1; i++) {
				char c = input.charAt(i + 1);
				char c1 = input.charAt(i);
				s = s + c + c1;
				i++;
			}

			s1 = s + input.charAt(input.length() - 1);
			System.out.println(s1);

		} else {
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i + 1);
				char c1 = input.charAt(i);

				s = s + c + c1;
				i++;

			}

			System.out.println(s);

		}

	}

}
