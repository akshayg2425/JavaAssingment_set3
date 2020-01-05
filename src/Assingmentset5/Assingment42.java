package Assingmentset5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assingment42 {

	public static void main(String[] args) {

		float sum = 0;
		int c = 0;
		Map<Integer, Float> m1 = new HashMap<Integer, Float>();

		m1.put(1, (float) 2.3);
		m1.put(2, (float) 5.8);
		m1.put(3, (float) 7.7);
		m1.put(4, (float) 8.8);

		Iterator<Integer> it = m1.keySet().iterator();

		while (it.hasNext()) {
			int q = it.next();

			if (q % 2 == 0) {

				sum += m1.get(q);

				c++;
			}

		}

		float e = (sum / c);
		System.out.println(e);

	}

}
