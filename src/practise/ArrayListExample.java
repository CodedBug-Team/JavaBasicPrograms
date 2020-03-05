package practise;
import java.util.*;
public class ArrayListExample
{public static void main(String args[]){
    ArrayList a=new ArrayList();
    a.add("ravi");
    a.add("raj");
    a.add("kajal");
   // System.out.println(a);
    Iterator b=a.iterator();
    {
    while(b.hasNext()){
        System.out.println(b.next());

    }
    }
}}