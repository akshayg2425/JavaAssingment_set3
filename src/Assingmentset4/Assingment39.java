package Assingmentset4;

public class Assingment39 {

	public static void main(String[] args) {

		String input1 = "the sun raises in the east";

		int max = 0;
		String s1 = "";

		String s2 = "aeiouAEIOU";

		String arr[] = input1.split(" ");

		for (int i = 0; i < arr.length; i++) {

			String s = arr[i];
			int n = 0;

			for (int j = 0; j < s.length(); j++) {

				for (int q = 0; q < s2.length(); q++) {

					if (s.charAt(j) == s2.charAt(q)) {
						n++;
					}
				}

			}

			if (n > max) {
				max = n;
				s1 = s;
			}

		}

		System.out.println(s1);

	}

}
