package Assingmentset4;

import java.util.StringTokenizer;

public class Assingment36 {

	public static void main(String[] args) {

		String s = "this isssss soooo good";
		String s1 = "";
		int max = 0;

		StringTokenizer st = new StringTokenizer(s, " ");

		while (st.hasMoreTokens()) {
			String s2 = st.nextToken();

			int n = 0;

			for (int i = 0; i < s2.length() - 1; i++) {
				if (s2.charAt(i) == s2.charAt(i + 1)) {
					n++;
				}

			}
			if (n > max) {
				max = n;
			}

		}
		System.out.println(max + 1);

	}

}
