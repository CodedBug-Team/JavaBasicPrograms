package practise;

public class LoopExample1 {
    public static void main(String args[]) {
        int i, j;
        for (i = 0; i <= 5; i++) {
            for (j = 0; j < i; j++) {
                System.out.println("i= "+i + " j: " + j);
            }
        }
    }
}
