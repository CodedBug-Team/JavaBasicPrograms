package pattern;

public class TreePattern6 {

	public static void main(String args[]) {

		int i, j, k;

		for (i = 1; i <= 5; i++) {

			for (j = 5 - i; j > 0; j--)
				System.out.print(" ");

			for (j = 1; j <= i; j++)
				System.out.print(i);

			for (k = 2; k <= i; k++)
				System.out.print(i);

			System.out.println();

		}
	}
}
