package Assingmentset4;

public class Assingment35 {

	public static void main(String[] args) {

		String ip = "bengzl";

		String op = " ";

		for (int i = 0; i < ip.length(); i++) {
			if (i % 2 == 0) {
				char c = ip.charAt(i);
				if (c == 'z') {
					c = 'a';
					op += c;
				} else {

					c++;
					op += c;
				}
			} else {
				char c = ip.charAt(i);
				op += c;
			}

		}

		System.out.println(op);
	}

}
