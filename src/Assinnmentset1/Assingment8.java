package Assinnmentset1;

public class Assingment8 {

	public static void main(String[] args) {

		String inputs = "helloworld";

		StringBuffer sb = new StringBuffer(inputs);

		int inputc = 2;

		char c = inputs.charAt(inputc);

		int count = 0;

		for (int i = 0; i < inputs.length(); i++) {
			if (c == inputs.charAt(i)) {
				count++;
			}

		}

		if (count > 2) {
			for (int i = 3; i < sb.length(); i++) {
				if (sb.charAt(i) == c) {
					sb.deleteCharAt(i);
				}
			}
		}

		System.out.println(sb);

	}

}
