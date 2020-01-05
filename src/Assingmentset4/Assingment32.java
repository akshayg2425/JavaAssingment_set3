package Assingmentset4;

import java.util.StringTokenizer;

public class Assingment32 {

	public static void main(String[] args) {

		String ip = "zonesty is my best policyy";

		int max = 0;

		String s = new String();

		StringTokenizer st = new StringTokenizer(ip, " ");

		while (st.hasMoreTokens()) {
			String s1 = st.nextToken();

			int n = s1.length();

			if (n > max) {
				max = n;
				s = s1;
			}

			if (n == max) {
				char c1 = s.charAt(0);

				char c2 = s1.charAt(0);

				if (c1 != c2) {
					if (c2 < c1) {
						s = s1;
					}
				}
			}

		}

		System.out.println(s);

	}

}
