package practise1.NewConstructorEx;

public class AbstractConstructor {
    void withoutConstructor(){
        System.out.println("I'm without Constructor");
        abstractStudent ab1 = new abstractStudent("Aman", 13, "11th", "B");
        abstractTeacher ab2 = new abstractTeacher("Biswa", 13, "11th", 2500);
        abstractEmployee ab3 = new abstractEmployee("Dev", 13, "Security-Guard", "9am-6pm");
    }

    void withConstructor(){
        System.out.println("With Constructor");
        abstractStudent1 ab1 = new abstractStudent1("Atul", 13, "12th", "B");
        abstractTeacher1 ab2 = new abstractTeacher1("Vikas", 13, "12th", 2500);
        abstractEmployee1 ab3 = new abstractEmployee1("Sonu", 13, "Security-Guard", "9am-6pm");
    }

    class abstractStudent extends AbstractWithoutConstructor{
        String className;
        String section;
        abstractStudent(String name, int rollno, String className, String section){
            this.name = name;
            this.Rollno = rollno;
            this.className = className;
            this.section = section;
            System.out.println("Name: "+name+"\nRoll no: "+rollno+"\nClass: "+className+ "\nSection: "+section);
        }
    }
    class abstractTeacher extends AbstractWithoutConstructor{
        String className;
        int salary;
        abstractTeacher(String name, int rollno, String className, int salary){
            this.name = name;
            this.Rollno = rollno;
            this.className = className;
            this.salary = salary;
            System.out.println("Name: "+name+"\nRoll no: "+rollno+"\nClass: "+className+ "\nSalary: "+salary);
        }
    }
    class abstractEmployee extends AbstractWithoutConstructor{
        String task;
        String shift;
        abstractEmployee(String name, int rollno, String task, String shift){
            this.name = name;
            this.Rollno = rollno;
            this.task = task;
            this.shift = shift;
            System.out.println("Name: "+name+"\nRoll no: "+rollno+"\nTask: "+task+ "\nShift: "+shift);
        }
    }

    /////////////////////////////////////////////////////////////////////////////////

    class abstractStudent1 extends AbstractWithConstructor{
        String className;
        String section;
        abstractStudent1(String name, int rollno, String className, String section){
            super(name, rollno);
            this.className = className;
            this.section = section;
            System.out.println("Name: "+name+"\nRoll no: "+rollno+"\nClass: "+className+ "\nSection: "+section);
        }
    }
    class abstractTeacher1 extends AbstractWithConstructor{
        String className;
        int salary;
        abstractTeacher1(String name, int rollno, String className, int salary){
            super(name, rollno);
            this.className = className;
            this.salary = salary;
            System.out.println("Name: "+name+"\nRoll no: "+rollno+"\nClass: "+className+ "\nSalary: "+salary);
        }
    }
    class abstractEmployee1 extends AbstractWithConstructor{
        String task;
        String shift;
        abstractEmployee1(String name, int rollno, String task, String shift){
            super(name, rollno);
            this.task = task;
            this.shift = shift;
            System.out.println("Name: "+name+"\nRoll no: "+rollno+"\nTask: "+task+ "\nShift: "+shift);
        }
    }
}
