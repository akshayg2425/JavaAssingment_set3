package Assingmentset2;

import java.util.ArrayList;
import java.util.List;

public class Assingment13 {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();

		l1.add(1);

		l1.add(2);

		l1.add(3);

		l1.add(4);

		List<Integer> l2 = new ArrayList<>();

		l2.add(1);

		l2.add(2);

		l2.add(3);

		l2.add(5);

		List<Integer> l3 = new ArrayList<>();
		List<Integer> l4 = new ArrayList<>();

		l3.addAll(l1);
		l4.addAll(l2);
		l1.removeAll(l2);
		l4.removeAll(l3);

		l1.addAll(l4);

		int[] output = new int[l1.size()];

		for (int i = 0; i < output.length; i++) {
			output[i] = l1.get(i);
		}

		for (int c : output) {
			System.out.println(c);
		}

	}

}
