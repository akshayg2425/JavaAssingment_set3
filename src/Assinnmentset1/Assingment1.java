package Assinnmentset1;

public class Assingment1 {

	public static void main(String[] args) {

		String[] input = { "2AA", "12", "ABC", "c1a" };

		int count = 0;

		String s1 = new String();

		for (int i = 0; i < input.length; i++) {

			s1 = input[i];

			for (int j = 0; j < s1.length(); j++) {

				char c = s1.charAt(j);

				if (Character.isDigit(c)) {

					int p = Integer.parseInt(String.valueOf(c));
					count = count + p;
				}

			}

		}

		System.out.println(count);
	}

}
