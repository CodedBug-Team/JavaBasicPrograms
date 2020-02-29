package practise1.InterfaceEx;

public class MainClass{

    public static void main(String[] args) {
        demoMain1 demoMain1 = new demoMain1();
        demoMain1.addSub("Math");
        demoMain1.editSubName("Math", "Mathematics");
        demoMain2 demoMain2 = new demoMain2();
        demoMain2.delSub("English");
        demoMain2.addSub("Punjabi");
    }
}

class demoMain1 extends StudentApp{

}

class demoMain2 extends StudentApp2{

    @Override
    public void delSub(String SubjectName) {
        System.out.println("from demoMain2 Class");
        System.out.println(SubjectName+" Subject Deleted");
    }
}