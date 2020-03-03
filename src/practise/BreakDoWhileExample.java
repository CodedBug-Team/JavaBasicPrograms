package practise;

public class BreakDoWhileExample {
    public static void main(String args[]) {
        int i=1;
        do {
            if (i == 5)
                break;

            i++;
           System.out.println(i);

        } while (i < 10);
      //  System.out.println("this");
    }
}
