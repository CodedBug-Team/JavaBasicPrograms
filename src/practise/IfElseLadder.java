package practise;

import java.util.Scanner;

public class IfElseLadder {
    public static void main(String args[]) { //String degree= "btechcs";
        // String degree = new String();
        // String btechcs = new String();
        //  String btechit = new String();
        // String btechec = new String();
        //  String mca = new String();
     //   System.out.println("enter degree");
        Scanner a = new Scanner(System.in);
       //String degree = a.nextLine().trim();
        int i;
        for(i=0;i<=5;i++) {
            System.out.println("enter degree");
            String degree = a.nextLine().trim();
            if (degree.equals("btechcs"))
                System.out.println("can fill the form for software engineer");
            else if (degree.equals("btechit"))
                System.out.println("can fill the form for asistant engineer");
            else if (degree.equals("btechec"))
                System.out.println("can fill the form for system engineer");
            else
                System.out.println("can fill the form for software developer");


        }
}}
