package basicPrograms;

import java.util.Scanner;

public class Vowels {

	public static void main(String args[]) {
		char c;
		Scanner b = new Scanner(System.in);

		System.out.println("enter character:");
		c = b.nextLine().charAt(0);
		switch (c) {

		case 'a':
			System.out.println("the given character is vowel:");
			break;

		case 'e':
			System.out.println("the given character is vowel:");
			break;

		case 'i':
			System.out.println("the given character is vowel:");
			break;

		case 'o':
			System.out.println("the given character is vowel:");
			break;

		case 'u':
			System.out.println("the given character is vowel:");
			break;

		default:
			System.out.println("the given character is not vowel:");
			break;
		}
	}
}
