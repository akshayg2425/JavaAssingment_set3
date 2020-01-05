package Assingmentset4;

import java.util.StringTokenizer;

public class Assingment37 {

	public static void main(String[] args) {

		String ip1 = "new york";
		String ip2 = "new jersey";

		StringBuffer sb = new StringBuffer();

		StringTokenizer st1 = new StringTokenizer(ip1, " ");

		StringTokenizer st2 = new StringTokenizer(ip2, " ");

		String s = st1.nextToken();

		String s1 = st1.nextToken();

		String s2 = st2.nextToken();

		String s3 = st2.nextToken();

		sb.append(s).append(" ");

		for (int i = 0; i < s1.length(); i++) {

			for (int j = 0; j < s3.length(); j++) {
				if (s1.charAt(i) == s3.charAt(j)) {
					sb.append(s1.charAt(i)).append("+");
				}

			}
		}

		System.out.println(sb);

	}

}
