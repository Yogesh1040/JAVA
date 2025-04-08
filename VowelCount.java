package assignment4;

import java.util.Scanner;

public class VowelCount {

	private static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	private static int countVowels(String name) {
		int count = 0;
		name = name.toLowerCase();

		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (isVowel(c)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the name of the person: ");
		String name = scanner.nextLine();

		int vowelCount = countVowels(name);

		System.out.println("The number of vowels in \"" + name + "\" is: " + vowelCount);
	}

}
