package Assinnmentset1;

public class Assingment3 {

	public static void main(String[] args) {

		String[] input1 = { "Vikas", "Lokesh", "Ashok" };

		StringBuffer sb = new StringBuffer();

		sb.append('"');

		for (int i = 0; i < input1.length; i++) {
			sb.append(input1[i]).append(',');

		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append('"');

		System.out.println(sb);

	}

}
