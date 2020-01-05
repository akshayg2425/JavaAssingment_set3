package Assingmentset3;

public class Assingment22 {

	public static void main(String[] args) {

		String input1 = "xaXafxsd";

		StringBuffer sb = new StringBuffer(input1);

		int z = 0;

		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == 'x') {
				sb.deleteCharAt(i);

				z++;
			}
		}

		for (int i = 0; i < z; i++) {
			sb.append('x');
		}

		System.out.println(sb);

	}
}
