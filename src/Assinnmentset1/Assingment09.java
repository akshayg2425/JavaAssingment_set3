package Assinnmentset1;

public class Assingment09 {

	public static void main(String[] args) {

		String[] inputa = { "100", "111", "10100", "10", "1111" };

		String inputs = "10";

		String s = "";

		int count = 0;

		for (int i = 0; i < inputa.length; i++) {
			s = inputa[i];

			if ((s.charAt(0) == inputs.charAt(0)) && (s.charAt(1) == inputs.charAt(1)) && (s.length() > 2)) {
				count++;
			}

		}

		System.out.println("Count of the having prefix '10' is ------ >> " + count);

	}

}
