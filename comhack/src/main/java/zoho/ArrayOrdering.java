package zoho;

public class ArrayOrdering {
	public static void main(String[] args) {
		int[] array = { 9, 8, 7, 6, 5, 4, 3, 1 };
		array = new ArrayOrdering().bubbleSort(array);
		sortArray(array);
	}

	/**
	 * This method is used to sort an array with maximum and minimum numbers
	 * 
	 */
	public static int[] sortArray(int array[]) {
		int length = array.length;
		int size = length - 1;
		int[] output = new int[length];
		for (int i = 0, j = 0; i <= length / 2; i++, size--, j = j + 2) {
			if (j < length - 1) {
				output[j] = array[size];
				output[j + 1] = array[i];
			}
		}
		for (int i = 0; i < output.length; i++)
			System.out.print(output[i]);

		return output;
	}

	/**
	 * Bubble sort algorithm is implemented here.
	 * 
	 * @param array
	 */
	public int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int swap = array[j];
					array[j] = array[j + 1];
					array[j + 1] = swap;
				}
			}
		}
		return array;
	}
}
