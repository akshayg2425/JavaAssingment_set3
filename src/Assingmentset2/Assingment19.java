package Assingmentset2;

public class Assingment19 {

	public static void main(String[] args) {

		int input1 = 1; // 1 // 2
		int input2 = 2; // 1 // 1
		int input3 = 1; // 3 // 1

		int sum = 0;

		if (input1 != input2 && input1 != input3 && input2 != input3) {
			sum = input1 + input2 + input3;
		}

		else if (input1 != input3 && input2 != input3 && input1 == input2) {

			sum = input3;
		}

		else if (input1 != input2 && input2 != input3 && input1 == input3) {
			sum = input2;
		} else if (input1 != input2 && input1 != input3 && input2 == input3) {
			sum = input1;
		}

		else {
			sum = 0;
		}

		System.out.println(sum);
	}

}
