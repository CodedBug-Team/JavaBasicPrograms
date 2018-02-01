package basicPrograms;

import java.util.Scanner;

public class Table {

	public static void main(String args[]) {
		int i, n;
		Scanner a = new Scanner(System.in);
		System.out.println("enter number:");
		n = a.nextInt();
		for (i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));
		}
	}
}
