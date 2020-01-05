package Assingmentset4;

public class Assingment40 {

	public static void main(String[] args) {

		String ip1 = "CTS-hyd-1234";
		String ip2 = "hyderabad";

		int count = 0;

		String[] s = ip1.split("-");

		String s1 = s[0];
		String s2 = s[1];
		String s3 = s[2];

		String s4 = ip2.substring(0, 3);

		if ((s1.equals("CTS")) && (s2.equals(s4)) && (s3.length() == 4)) {
			for (int i = 0; i < s3.length(); i++) {
				if (Character.isDigit(s3.charAt(i))) {
					count++;
				}

			}
		}

		if (count == 4) {
			System.out.println(" ^^^ String In Format ^^^");
		} else {
			System.out.println("!!! String Not in Format !!!!");
		}
	}

}
