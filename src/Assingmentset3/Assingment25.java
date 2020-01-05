package Assingmentset3;

public class Assingment25 {

	public static void main(String[] args) {

		String input = "hello";
		int n = 3;

		String s = input.substring(input.length() - 2, input.length());

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < n; i++) {
			sb.append(s);
		}

		System.out.println(sb);

	}

}
