package practise;

public class SimpleClassExample {
int num1=5;
int num2=10;
int result;
int perform()
{
    result=num1+num2;
    return result;
}
//void SimpleClassExample(){


     //   }
    public static void main(String args[])
    {
        SimpleClassExample obj=new SimpleClassExample();
     int   k=obj.num1;
     obj.perform();//
      System.out.println(obj.num1);
        System.out.println(obj.result);//
        System.out.println(obj.perform());
}}

