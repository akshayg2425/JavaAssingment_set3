package Assingmentset3;

public class Assingment28 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		String input = "AIUPH9801J";

		boolean b = false;
		boolean b1 = false;

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if ((c >= 'A' && c <= 'Z') && input.length() == 10) {

				b1 = true;
			}

			if (b1 == true) {
				if ((input.charAt(0) >= 'A' && input.charAt(0) <= 'Z')
						&& (input.charAt(1) >= 'A' && input.charAt(1) <= 'Z')
						&& (input.charAt(2) >= 'A' && input.charAt(2) <= 'Z')
						&& (input.charAt(3) >= 'A' && input.charAt(3) <= 'Z')
						&& (input.charAt(4) >= 'A' && input.charAt(4) <= 'Z')) {
					int z = Integer.parseInt(input.valueOf(input.charAt(5)));
					int x = Integer.parseInt(input.valueOf(input.charAt(6)));
					int v = Integer.parseInt(input.valueOf(input.charAt(7)));
					int n = Integer.parseInt(input.valueOf(input.charAt(8)));
					if ((z >= 0 && z <= 9) && (x >= 0 && x <= 9) && (v >= 0 && v <= 9) && (n >= 0 && n <= 9)) {

						if (input.charAt(input.length() - 1) >= 'A' && input.charAt(input.length() - 1) <= 'Z') {
							b = true;
						}

					}
				}
			} else {
				System.out.println("Not in particuler FORMAT");
				break;
			}

			if (b == true) {
				System.out.println("+++ Valid +++ Pan card no.");
				break;
			} else {
				System.out.println("Not a ---Valid--- pan card no.");
			}
		}

	}

}
