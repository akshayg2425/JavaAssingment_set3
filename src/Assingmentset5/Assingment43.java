package Assingmentset5;

public class Assingment43 {

	public static void main(String[] args) {

		String color_code = "#3$3456";
		boolean b = false;

		if ((color_code.charAt(0) == '#') && (color_code.length() == 7)) {
			for (int i = 1; i < color_code.length(); i++) {
				char c = color_code.charAt(i);
				if (Character.isDigit(c) || ((c >= 'A') && (c <= 'F'))) {
					
					if(c !='@' && c !='!'&& c !='$' && c !='%' && c !='^' && c !='&'&& c !='*' && c !='(' && c !=')') {

					b = true;

					}
				}

			}
		}

		if (b == true) {
			System.out.println(1);
		} else {
			System.out.println(-1);
		}
	}

}
