package Assingmentset5;

import java.util.HashMap;
import java.util.Iterator;

public class Assingment50 {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<>();

		hm.put("mouse", "100.2");
		hm.put("speakar", "500.6");
		hm.put("Monitor", "2000.23");

		String[] input2 = { "speakar", "mouse" };
		float f = 0;

		Iterator<String> i = hm.keySet().iterator();

		while (i.hasNext()) {
			String s = i.next();

			float f1 = Float.parseFloat(hm.get(s));

			for (int j = 0; j < input2.length; j++) {
				if (input2[j] == s) {
					f += f1;
				}
			}
		}

		System.out.println(f);
	}

}
