package zoho;

public class RemoveEvenNos {
	public static void main(String[] args) {

		int[] array = { 1, 2, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 20 };
		int[] output = new int[array.length];
		int index = 0;
		for (int a = 0; a < array.length; a++) {
			if ((array[a] % 2) != 0) {
				output[index] = array[a];
				index++;
			}
			// else
			// output[a] = array[a];
		}
		for (int i : output) {
			System.out.print(i);
		}

		removeEvenFromArray();
	}

	public static void removeEvenFromArray() {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 3 };
		int l = array.length - 1;
		for (int i = 0; i <= l; i++) {
			if (array[i] % 2 == 0 && array[i] != 0) {
				int j = i;
				for (; j < l; removeEvenFromArray()) {
					array[j] = array[j + 1];
				}
				array[l--] = 0;
				i--;
			}
		}
		for (int z : array) {
			System.out.print(z);
		}
	}
}
