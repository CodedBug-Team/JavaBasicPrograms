package practise1.NewConstructorEx;

public class student2 extends student {

    String className;
    String section;

    student2(String name, int rollno, String className, String section){
        super(name, rollno);
        System.out.println("Child Class HashCode: "+this.hashCode());
        this.className = className;
        this.section = section;
    }

}
