package Assingmentset5;

import java.util.StringTokenizer;

public class Assingment51 {

	public static void main(String[] args) {

		double input1 = 20.0;

		String s = String.valueOf(input1);

		StringTokenizer st = new StringTokenizer(s, ".");

		String s1 = st.nextToken();

		String s2 = st.nextToken();

		int n1 = s1.length();

		int n2 = s2.length();

		if (s1.charAt(0) == '0') {
			n1 = s1.length() - 1;
		}

		if (n2 != 1) {
			if (s2.charAt(s2.length() - 1) == '0') {
				n2 = s2.length() - 1;
			}
		}

		System.out.println(n1 + ":" + n2);

	}

}
