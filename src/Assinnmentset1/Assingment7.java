package Assinnmentset1;

public class Assingment7 {

	public static void main(String[] args) {

		String[] input1 = { "ABX", "ac", "acd", "qcb", "io" };

		int input2 = 3;

		String s1 = new String();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < input1.length; i++) {

			s1 = input1[i];

			if (s1.length() < (input2)) {
				char c = '$';

				sb.append(c);
			} else {

				char c = s1.charAt((input2 - 1));
				sb.append(c);
			}

		}

		System.out.println(sb);

	}

}
