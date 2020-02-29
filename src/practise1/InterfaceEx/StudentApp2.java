package practise1.InterfaceEx;

abstract class StudentApp2 implements SubjectInterface{
    @Override
    public void addSub(String SubjectName) {
        System.out.println("from StudentApp2 Class");
        System.out.println(SubjectName+" Subject Added");
    }

    @Override
    public void editSubName(String oldName, String newName) {
        System.out.println("from StudentApp2 Class");
        System.out.println("Subject Edited from "+oldName+" to "+newName);
    }
}
