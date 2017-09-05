package zoho;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stubse
		PalindromeCheck palindromeCheck = new PalindromeCheck();
		String test = "tests";
		int outputCounter = 0;
		Boolean flag = false;
		for (int i = 0; i < test.length() - 1; i++) {
			System.out.println(test);
			flag = palindromeCheck.checkPalindrome(test);
			if (flag) {
				System.out.println("Palindrome");
				break;
			} else {
				i++;
				if (i < test.length() - 1) {
					char t = test.charAt(i);
					System.out.println(i + "" + t);
					test = test.replaceFirst(test.charAt(i + 1) + "", t + "");
					test = test.replaceFirst(t + "", test.charAt(i + 1) + "");
				}
			}
		}
		if (test.length() != outputCounter && !flag) {
			System.out.println("Not Palindrome");
		}
	}

	public boolean checkPalindrome(String value) {
		int counter = 0;
		int length = value.length() - 1;
		int decrementCounter = length;
		for (int i = 0; i < length; i++) {
			if (value.charAt(i) == value.charAt(decrementCounter)) {
				counter++;
				decrementCounter--;
			}
		}
		if (counter == length) {
			return true;
		} else {
			return false;
		}
	}

}
