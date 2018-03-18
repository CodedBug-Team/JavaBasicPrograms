package pattern;

public class ComplexTreeFormation1 {

	public static void main(String args[]) {
		int i, j, n = 5;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (j = i; j >= 1; j--) {
				if ((i + j) % 2 == 0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}

			}
			System.out.println("\n");

			for (j = 2; j > n; j--) {
				if ((i + j) % 2 == 0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();

		}
	}
}
