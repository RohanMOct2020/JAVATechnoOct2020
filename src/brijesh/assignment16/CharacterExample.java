package brijesh.assignment16;

import java.util.Scanner;

public class CharacterExample {

	void findFrequency(String string) {
		for (int index = 0; index < string.length(); index++) {
			char character=string.charAt(index);
			int count=0;
			for (int j = 0; j < string.length(); j++) {
				if(string.charAt(j)==character)
					count++;
			}
			System.out.println("Frequency of '"+character+"': "+count);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter string: ");
		new CharacterExample().findFrequency(scanner.next());
		scanner.close();
	}
}
