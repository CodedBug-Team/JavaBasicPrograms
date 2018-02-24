package pattern;

public class BinaryTreePattern2 {

	public static void main(String args[]) {
		int n = 5;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				if ((i + j) % 2 == 0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}

			}
			System.out.println("\n");
		}
	}

}
