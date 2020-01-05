package Assingmentset5;

import java.util.LinkedHashSet;
import java.util.Set;

public class Assingment41 {

	public static void main(String[] args) {
		String ip = "this is sample test case";

		StringBuffer sb = new StringBuffer();

		Set<Character> c = new LinkedHashSet<>();
		for (int i = 0; i < ip.length(); i++) {
			c.add(ip.charAt(i));
		}

		for (char c1 : c) {
			sb.append(c1);
		}

		System.out.println(sb);

	}

}
