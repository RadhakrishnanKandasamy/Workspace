package pattern;

public class DNA {
	public static void main(String[] args) {
		new DNA().print(5, 5);
	}

	public void print(int number, int numberOfTimes) {
		while (numberOfTimes > 0) {
			for (int i = 0, k = number; i <= number; i++, k--) {
				for (int j = 0; j <= number; j++) {
					if (i == j)
						System.out.print("*");
					else if (k == j)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println("");
			}
			numberOfTimes--;
		}
	}
}
