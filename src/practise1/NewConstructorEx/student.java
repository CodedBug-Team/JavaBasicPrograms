package practise1.NewConstructorEx;

public class student {

    String name;
    int rollno;

    student(String name, int rollno){
        System.out.println("Parent Class HashCode: "+this.hashCode());
        this.name = name;
        this.rollno = rollno;
    }
}
