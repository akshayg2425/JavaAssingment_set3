package Assingmentset3;

public class Assingment21 {

	public static void main(String[] args) {
		String s = "hello*hellu";
		int n = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '*') {
				n = i;
			}
		}

		String s1 = s.substring(0, n);

		String s2 = s.substring(n + 1, s.length());

		if (s1.equals(s2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
