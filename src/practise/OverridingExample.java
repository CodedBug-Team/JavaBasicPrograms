package practise;

public class OverridingExample
{
        public  void display()
        {
            System.out.println("donald trump is coming India");
        }
}

class ChildClass extends OverridingExample
{public void display()
{
    System.out.println("we can analyse ourselves by exploring ourselves");
}
   public static void main(String args[])
   {
     OverridingExample obj4=new OverridingExample();
     obj4.display();
}}