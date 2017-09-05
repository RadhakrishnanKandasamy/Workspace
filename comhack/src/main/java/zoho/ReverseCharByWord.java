package zoho;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReverseCharByWord {
	public static void main(String[] args) {
		System.out.println(reverseCharbyWord("Hi… I didn’t expect this from you…"));
		System.out.println(reverseCharbyWord("This is version 4.1.005-e…"));
	}

	public static String reverseCharbyWord(String string) {
		String[] arr = string.split(" ");
		List<String> list = Arrays.asList(arr);
		StringBuilder tempList = new StringBuilder();

		Stack<String> stringStack = new Stack<>();
		for (String string2 : arr) {
			stringStack.push(string2);
		}
		StringBuilder reversedString = new StringBuilder();
		while (!stringStack.isEmpty()) {
			reversedString.append(stringStack.pop());
		}

		reversedString = new StringBuilder(getCharacters(reversedString.toString()));
		System.out.println(reversedString.toString() + "\n" + string);

		int index = 0;
		String temp = "";
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (Character.isAlphabetic(c)) {
				temp += reversedString.charAt(index) + "";
				index++;
			} else {
				temp += c;
			}
		}

		System.out.println(temp);

		/*
		 * for (int i = listSize; i >= 0; i--) {
		 * tempList.append(reverseString(list.get(i))); tempList.append(" ");
		 * 
		 * 
		 * }
		 */
		System.out.println(tempList);
		return tempList.toString();
	}

	/**
	 * This method is used to reverse the given string
	 * 
	 * @param string
	 * @return
	 */
	public static String reverseString(String string) {
		if (string == null || string.isEmpty()) {
			return "";
		}
		int length = string.length() - 1;
		StringBuilder value = new StringBuilder();
		for (int i = length; i >= 0; i--) {
			char c = string.charAt(i);
			if (Character.isAlphabetic(c)) {
				value.append(c);
			}
		}
		return value.toString();
	}

	public static String getCharacters(String s) {
		if (s == null || s.isEmpty()) {
			return "";
		}
		StringBuilder value = new StringBuilder();
		for (int i = -0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isAlphabetic(c)) {
				value.append(Character.toString(c));
			}
		}
		return value.toString();
	}
}
