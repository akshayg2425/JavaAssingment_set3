package Assingmentset2;

public class Assingment14 {

	public static void main(String[] args) {

		String[] s = { "pinky", "preethi", "puppy", "preeth", "puppypreethi" };

		int n = 0;

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				String s1 = s[i];

				String s2 = s[j];

				if (s1.startsWith(s2) || s2.startsWith(s1)) {
					n++;
				}

			}

		}

		System.out.println(n);

	}

}
