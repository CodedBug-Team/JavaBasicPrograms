package pattern;

public class Tree {

	static int abc = 0; // instance variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abcd = 0; // local variable

		int sp = 2;
		int st = 1;
		for (int i = 1; i <= 3; i++) {

			int abcde = 0; // local variable
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			sp--;
			for (int z = 1; z <= st; z++) {
				System.out.print("* ");
			}
			System.out.println();
			st++;
		}

	}

	/*public static void sum() {
		System.out.println(Tree.abcd);
	}*/

}
