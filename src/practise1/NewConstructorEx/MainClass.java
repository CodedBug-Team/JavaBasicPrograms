package practise1.NewConstructorEx;

public class MainClass {

    public static void main(String[] args) {
        student s = new student("Rahul", 34);

        System.out.println("Name is : "+s.name+"\nRoll no: "+s.rollno);

        student2 s2 = new student2("Dev", 12, "12th", "B");

        System.out.println("Name: "+s2.name+"\nRoll no: "+s2.rollno+"\nClass: "+s2.className+ "\nSection: "+s2.section);

        AbstractConstructor ab1 = new AbstractConstructor();
        ab1.withoutConstructor();
        ab1.withConstructor();
    }


}