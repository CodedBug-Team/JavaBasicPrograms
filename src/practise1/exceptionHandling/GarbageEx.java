package practise1.exceptionHandling;
// Ways to make an object eligible for GC
// 1. Nullifying the reference variable
// 2. Re-assigning the reference variable
// 3. Object created inside method  (No longer need of an object)
// 4. Island of Isolation  (a = 5,  b = a,  a = null then b automatically eligible for gc)

public class GarbageEx {
    public void m1(){
        char[] sayhello = { 'h', 'e', 'l', 'l', 'o'};
        String str = new String(sayhello);
        System.out.println(str);
        str = null;
        System.gc();
    }
}
