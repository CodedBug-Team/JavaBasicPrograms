package practise;

//use of this keyword in java
public class CollegeDetails {
    public static void main(String args[]) {
        Student obj = new Student("navin",9,18,52);
      //  Student obj = new Student("kavita",10,20,50);



       /* obj.setRoll_no(18);
        obj.setAge(20);
        obj.setMarks(21/3);
        obj.setName("n");*/


        System.out.println(obj.getName() + " "+ obj.getRoll_no() + " " + obj.getAge() + " " + obj.getMarks());
    }

}
class Student {
    private String name;
    private int roll_no;
    private int age;
    private int marks;

    public Student(String name, int roll_no, int age, int marks) {
       this.name = name;
     this.roll_no = roll_no;
       this.age = age;
      this.marks = marks;
   }

   /* public void setName(String name) {
        this.name = name;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }*/

    public String getName() {
        return name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {

        return marks;
    }
}