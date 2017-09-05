package zoho;

/**
 * This class is used to replace the word in a string by case sensitive.
 * 
 * 
 * string: zoho is well known company. ZoHo corporation has more employees. find
 * string: zoho replace string: test
 * 
 * @author Sasidon
 *
 */
public class ReplaceWord {

	public static void main(String[] args) {
		ReplaceWord replaceWord = new ReplaceWord();
		replaceWord.process("zoho is well known company. ZoHo corporation has more  employees.", "zoho", "test");
	}

	/**
	 * This method is used to get the array of words from the string
	 */
	public String[] getWords(String data) {
		String[] arr = null;
		if (data != null && !data.trim().isEmpty()) {
			arr = data.split(" ");
		}
		return arr;
	}

	public void process(String data, String key, String value) {
		String[] arr = getWords(data);
		StringBuilder output = new StringBuilder();
		for (String s : arr) {
			if (s.equalsIgnoreCase(key)) {
				for (int i = 0; i < s.length(); i++) {
					char c = s.charAt(i);
					char k = value.charAt(i);
					if (Character.isLowerCase(c)) {
						c = Character.toLowerCase(k);
					} else if (Character.isUpperCase(c)) {
						c = Character.toUpperCase(k);
					}
					output.append(Character.toString(c));
				}
			} else
				output.append(s);
			output.append(" ");
		}
		System.out.println("String :" + data);
		System.out.println("Key :" + key);
		System.out.println("Value :" + value);
		System.out.println("Output :" + output.toString());
	}
}
