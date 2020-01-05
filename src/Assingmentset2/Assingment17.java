package Assingmentset2;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Assingment17 {

	public static void main(String[] args) {

		String input1 = "AAA/abb/CCC";

		StringTokenizer st = new StringTokenizer(input1, "/");

		List<String> l = new ArrayList<String>();

		while (st.hasMoreTokens()) {
			StringBuffer sb = new StringBuffer(st.nextToken().toLowerCase());

			l.add(sb.reverse().toString());

		}
		String[] output = new String[l.size()];

		for (int i = 0; i < output.length; i++) {
			output[i] = l.get(i);
		}

		for (String p : output) {
			System.out.println(p);
		}

	}

}
