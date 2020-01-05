package Assingmentset3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assingment23 {

	public static void main(String[] args) {

		Map<String, Integer> h1 = new HashMap<String, Integer>();

		h1.put("abc", 50);
		h1.put("efg", 70);

		Map<String, String> h2 = new HashMap<>();

		for (Map.Entry<String, Integer> esi : h1.entrySet()) {

			if (esi.getValue() < 60) {
				String s = "Fail";
				h2.put(esi.getKey(), s);

			} else {
				String s = "Pass";
				h2.put(esi.getKey(), s);
			}
		}

		System.out.println(h2);
	}

}
