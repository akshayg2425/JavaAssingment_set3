package Assinnmentset1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assingment2 {

	public static void main(String[] args) {

		String[] input = { "goa", "kerala", "gujarat" };

		Map<String, String> hm = new HashMap<String, String>();

		for (int i = 0; i < input.length; i++) {
			String s = input[i];

			String s1 = s.substring(0, 3).toUpperCase();

			hm.put(s1, s);

		}

	
			System.out.println(hm);
		
	}

}
