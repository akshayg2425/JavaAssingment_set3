package Assinnmentset1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Assingment6 {

	public static void main(String[] args) {

		String ip2 = "hari";

		List<String> l = new ArrayList<String>();

		Map<String, String> hm = new HashMap<String, String>();

		hm.put("ram", "hari");
		hm.put("cisco", "barfi");
		hm.put("honeywell", "cs");
		hm.put("cts", "hari");

		for (Map.Entry<String, String> ekv : hm.entrySet()) {

			ekv.getKey();
			ekv.getValue();
			if (ekv.getValue().equals(ip2)) {

				l.add(ekv.getKey());
			}
		}

		String[] op = new String[l.size()];
		for (int i = 0; i < l.size(); i++) {
			op[i] = l.get(i);
			System.out.println(op[i]);
		}

	}

}
