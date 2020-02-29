package practise1;

public class method2 implements methods {
    @Override
    public void addition(String s) {
        System.out.println("Implementation from method 2 "+s);
    }

    @Override
    public void addition(int i) {
        System.out.println("Implementation from method 2 "+i);
    }

    @Override
    public void addition(int a, int b) {
        System.out.println("Implementation from method 2 "+a+b);
    }
}
