
package practise1.PackageEx;


import practise1.PackageEx.newPackage.DemoClass1;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Package Demo");
        DemoClass1 D1 = new DemoClass1();
        D1.method1();


        DemoClass2 D2 = new DemoClass2();
        D2.method2();
    }
}
