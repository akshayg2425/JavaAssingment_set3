package Assinnmentset1;

public class Assingment4 {

	public static void main(String[] args) {

		String input1 = "tst@gmail.com";

		int p1 = 0;
		int p2 = 0;

		int cp1 = 0;
		int cp2 = 0;

		boolean b = false;

		String q = ".com";
		if (input1.endsWith(q)) {

			for (int i = 0; i < input1.length(); i++) {
				if (input1.charAt(i) == '@') {
					p1 = i;
					cp1++;
					for (int j = 0; j < input1.length(); j++) {
						if (input1.charAt(j) == '.') {

							p2 = j;
							cp2++;

						}

					}
				}
			}

			if (cp1 == 0 || cp2 == 0) {
				System.out.println("Mail Id is Not Valid!!");

			} else {
				String s = input1.substring((p1 + 1), (p2));

				String s1 = input1.substring(0, p1);

				if (s.length() == 5 && s1.length() >= 3) {
					if (cp1 < 2 && cp2 < 2) {
						b = true;
					}
				}

			}

		}
		if (b == true) {
			System.out.println("Mail Id is Valid!!!");
		} else {
			System.out.println("Mail Id is Not Valid!!");
		}

	}

}
