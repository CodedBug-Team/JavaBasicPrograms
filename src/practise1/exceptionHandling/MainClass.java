package practise1.exceptionHandling;

public class MainClass extends GarbageEx {


    public static void main(String[] args){
        MainClass mainClass = new MainClass();
        GarbageEx gc = new GarbageEx();// to handle that case.
        //mainClass.checkedException();
        //mainClass.uncheckedException();

        //mainClass.handlingException();

        gc.m1();

    }

    /*void checkedException(){
        PrintWriter pw =  new PrintWriter("abc.txt");   // their is a possibility that abc.txt file
        pw.println("Hello");                                     //  may not present their. So add Exception

        System.out.println("Hello World");
        Thread.sleep(1000);                                // their is chance to sleeping mathod will
                                                                 // be interupted by any other thread.
    }*/

    /*void uncheckedException(){
        System.out.println(10/0);
    }*/

    void handlingException(){
        System.out.println("Line 1");
        try {
            System.out.println(10/1);                  // Risky code which may throws error is write in try block
            System.out.println(10/0);                  // Risky code which may throws error is write in try block
            //System.out.println(10/5);                // remaining code will not execute
        }
        catch (ArithmeticException e){
            System.out.println(e);                      // Exception is handled in catch block. This method print only name of the exception.
            e.printStackTrace();                        // Method to print Exception Details. This method print complete detail about Exception.
            System.out.println(e.getMessage());         // This method print only description of exception.
            //System.out.println(10/0);                 // if exception occur in catch then Program terminate abnormally
        }
        finally{
            System.out.println("Print me");             // finally block runs in both try as well as with catch condition until there is no System.exit(0) statement,
        }
        System.out.println("Line 3");
    }
}
