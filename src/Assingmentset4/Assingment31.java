package Assingmentset4;

public class Assingment31 {

	public static void main(String[] args) {

		String input1 = "yuiop";
		String input2 = "helloworld";

		if (input1.length() == input2.length()) {
			System.out.println('"' + input1.concat(input2) + '"');
		}

		if (input1.length() > input2.length()) {
			String s = input1.substring(input2.length(), input1.length());

			System.out.println('"' + s.concat(input2) + '"');

		} else if (input2.length() > input1.length()) {
			String s = input2.substring(input1.length(), input2.length());

			System.out.println('"' + s.concat(input1) + '"');
		}

	}

}
