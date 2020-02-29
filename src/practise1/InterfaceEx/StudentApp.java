package practise1.InterfaceEx;

public class StudentApp implements SubjectInterface {
    String section = className+" A Sec";
    @Override
    public void addSub(String SubjectName) {
        System.out.println("from StudentApp Class");
        System.out.println(SubjectName+" Subject Added");
    }

    @Override
    public void editSubName(String oldName, String newName) {
        System.out.println("from StudentApp Class");
        System.out.println("Subject Edited from "+oldName+" to "+newName);
    }

    @Override
    public void delSub(String SubjectName) {
        System.out.println("from StudentApp Class");
        System.out.println(SubjectName+" Subject Deleted");
    }
}
