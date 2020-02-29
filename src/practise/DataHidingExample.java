package practise;

public class DataHidingExample {
    public String getBalance() {
        String firstname = "navin";
        String lastname = "reddy";
        String fullname = firstname + lastname;
        return fullname;

    }

    public static void main(String args[]) {
        DataHidingExample obj9 = new DataHidingExample();
        obj9.getBalance();
        System.out.println(obj9.getBalance());

    }
}

class DataHidingExample1 {
    String firstname = "navin";
    public String getBalance() {

        String lastname = "reddy";

        return firstname + "" + lastname;
    }

    public static void main(String args[]) {
        DataHidingExample1 obj9 = new DataHidingExample1();
        obj9.getBalance();
        System.out.println("navin" + " " + "reddy");

    }

}

class DataHidingExample2 {


    private String getBalance() {
        String firstname = "navin";
        String lastname = "reddy";

        return firstname + "" + lastname;
    }
}

class Experiment {

    DataHidingExample1 o = new DataHidingExample1();
        private String m1(){
             o.getBalance();
             return o.firstname;
        }
    public static void main0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                (String args[]) {
     Experiment o2=new Experiment();
        System.out.println(o2.m1());

    }
}