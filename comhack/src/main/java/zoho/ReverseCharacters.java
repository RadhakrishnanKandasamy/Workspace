package zoho;

public class ReverseCharacters {
	public static void main(String[] args) {
		String input = "hello 12321 this is ..it.it.me!!!diana";
		System.out.println(input);
		System.out.println(reverseCharacter(input));
	}

	public static String reverseCharacter(String string) {
		if (string == null || string.isEmpty()) {
			return "";
		}
		StringBuilder temp = new StringBuilder();
		int length = string.length();
		int reversePointer = length - 1;
		for (int i = 0; i < length; i++) {
			char c = string.charAt(i);
			if (Character.isAlphabetic(c)) {
				for (int k = reversePointer; k >= 0; k--) {
					char localChar = string.charAt(k);
					if (Character.isAlphabetic(localChar)) {
						temp.append(Character.toString(string.charAt(k)));
						reversePointer--;
						break;
					} else {
						reversePointer--;
					}
				}
			} else {
				temp.append(Character.toString(string.charAt(i)));
			}
		}
		return temp.toString();
	}
}
