package zoho;

public class RemoveEvenNumbers {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 23, 24, 25, 12, 14 };
		new RemoveEvenNumbers().removeEvenNumbers(array);
	}

	public int[] removeEvenNumsers(int[] input) {

		int[] output = new int[input.length];

		for (int i = 0, j = 0; i < input.length; i++) {
			if (input[i] % 2 != 0) {
				output[j] = input[i];
				j++;
			}
		}
		/*
		 * for (int i = 0; i < output.length; i++) {
		 * System.out.println(output[i]); }
		 */
		return output;
	}

	public void removeEvenNumbers(int[] input) {

		int j = input.length - 1;
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 2 == 0 && input[i] != 0) {
				input[i] = input[j];
				input[j] = 0;
				j--;
				i--;
			}
		}

		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}

	}

}
