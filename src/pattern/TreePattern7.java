package pattern;

public class TreePattern7 {

	public static void main(String args[]) {
		int i, j, n = 5;
		for (i = 1; i <= 5; i++) {
			for (j = 5; j >= 1; j--) {
				if (j <= i)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			for (j = 2; j <= n; j++) {
				if (j <= i)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
