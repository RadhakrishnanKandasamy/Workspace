package pattern;

public class ArrowPattern {

	public static void main(String[] args) {
		new ArrowPattern().printChar(15);
	}

	public void putEmptySpaces(int n) {
		for (int i = 1; i < n; i++) {
			System.out.print(" ");
		}
	}

	public void printChar(int n) {
		for (int i = 0; i < n; i++) {
			process(i);
		}
		for (int i = n; i >= 0; i--) {
			process(i);
		}
	}

	public void process(int i) {
		putEmptySpaces(i);
		for (int j = 1; j < i; j++)
			System.out.print("*");
		System.out.println("");
	}
}
