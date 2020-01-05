package Assingmentset3;

public class Assingment27 {

	public static void main(String[] args) {

		String s = "a@34567@";

		char c = s.charAt(0);
		char c2 = s.charAt(s.length() - 1);

		boolean b = false;

		if (s.length() >= 8) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '@' || s.charAt(i) == '_' || s.charAt(i) == '#') {
					if (c != 1 && c != 2 && c != 3 && c != 4 && c != 5 && c != 6 && c != 7 && c != 8 && c != 9 && c != 0
							&& c != '@' && c != '_' && c != '#') {

						if (c2 != '@' && c2 != '_' && c2 != '#') {
							b = true;
						}
					}

				}
			}

		}

		if (b == true) {
			System.out.println("Password +++is+++ Valid-----");
		} else {
			System.out.println("Password is --- not --- Valided-----");
		}

	}

}
