package zoho;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TwoDArray().generate();
	}

	public void generate() {
		int[][] array = { { 1, 2, 3, 4, 5 }, { 4, 5, 6, 6, 7 }, { 7, 8, 9, 9, 9 }, { 7, 8, 9, 9, 8 },
				{ 7, 8, 9, 9, 8 } };
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println("");
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int value = array[i][j];
				if (j == 0 || j == n - 1 || i == 0 || i == n - 1)
					System.out.print("\t" + value * 2);
				else if (i == n / 2 && j == n / 2) {
					System.out.print("\t" + value * 4);
				} else {
					System.out.print("\t" + value);
				}
			}
			System.out.println("");
		}
	}

}
