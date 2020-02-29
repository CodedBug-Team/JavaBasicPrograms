package practise1;

public class MainClass extends method1 {               //inheritance

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();                  // Class Objects
        mainClass.program();

        method2 method2 = new method2(){
            @Override
            public void addition(int i) {
                System.out.println("I'm Modified in MainClass = "+i+100);
            }
        };
        method2.addition(100);
        method2.addition("Hello");
    }

    private void program(){
        addition("a");                                     // overloading (Polymorphism)
        addition(5);                                       // overloading (Polymorphism)
        addition(5,7);                                  // overloading + overriding   (Polymorphism)
    }

    @Override                                                   // overriding
    public void addition(int a, int b) {
        System.out.println("Addition: "+(a+b));
    }
}
