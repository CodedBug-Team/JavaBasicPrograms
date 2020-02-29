package practise1.staticKeyword;

public class MainClass {

    public static void main(String[] args) {
        otherClass otherClass1 = new otherClass();
        otherClass otherClass2 = new otherClass();

        System.out.println("Printing with First Object");
        for (int i = 1; i<=5; i++) {
            otherClass1.counter1();
            otherClass1.counter2();
        }

        System.out.println("Printing with Second Object");
        for (int i = 1; i<=5; i++) {
            otherClass2.counter1();
            otherClass2.counter2();
        }
    }
}

class otherClass{
    int count1 = 1;
    static int count2 = 1;

    void counter1(){
        System.out.println("Simple Counter value: "+ count1++);
    }
    void counter2(){
        System.out.println("Static Counter value: "+count2++);
    }
}
