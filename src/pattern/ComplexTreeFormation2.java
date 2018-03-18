package pattern;

public class ComplexTreeFormation2 {

	public static void main(String args[]) {
		int i, j, k, n = 5;
		for (i = 1; i <= n; i++) {
			for (j = 5; j >= i; j--) {
				System.out.print(j);
			}
			for (k = 2; k <= i; k++) {
				System.out.print(" ");
			}
			for (k = 3; k <= i; k++) {
				System.out.print(" ");
			}
			for (j = i; j <= n; j++) {
				if (j != 1) {
					System.out.print(+j);
				}
			}
			System.out.println();
		}
		for (i = 5; i >= 1; i--) {
			for (j = 5; j >= i; j--) {
				System.out.print(j);
			}
			for (k = 2; k <= i; k++) {
				System.out.print(" ");
			}
			for (k = 3; k <= i; k++) {
				System.out.print(" ");
			}
			for (j = i; j <= n; j++) {
				if (j != 1) {
					System.out.print(+j);
				}
			}
			System.out.println();
		}
	}

}
