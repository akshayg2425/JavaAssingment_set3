package Assingmentset5;

import java.util.StringTokenizer;

public class Assingment45 {

	public static void main(String[] args) {

		String input = "california,3";

		StringTokenizer st = new StringTokenizer(input, ",");

		String s1 = st.nextToken();

		String s2 = st.nextToken();

		int n = Integer.parseInt(s2);

		if (s1.length() > 2 * n) {
			String o1 = s1.substring(0, 3);
			String o2 = s1.substring(s1.length() - 3, s1.length());

			String o = o1.concat(o2);

			System.out.println(o);
		}

	}

}
