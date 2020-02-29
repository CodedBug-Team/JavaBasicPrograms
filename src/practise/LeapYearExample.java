package practise;

import java.util.Scanner;
public class LeapYearExample {
    public static void main(String args[])
    {//int year=0;
        Scanner a=new Scanner(System.in);
        int year=a.nextInt();
        if((year%4==0)&&(year%100!=0)||(year%400==0))
            System.out.println("leap year");
        else
            System.out.println("not a leap year");
    }
}

