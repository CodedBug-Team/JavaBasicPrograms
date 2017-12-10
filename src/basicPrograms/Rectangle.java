package basicPrograms;

import java.util.Scanner;

public class Rectangle {

	public static void main(String args[])
	{
	float a,b,area=0,perimeter=0;
	Scanner in = new Scanner(System.in);
	System.out.println("enter width and height:");
	a= in.nextFloat();
	b= in.nextFloat();
	area = a * b;
	perimeter = 2*(a+b);
	System.out.println("Area is:"+area);
	System.out.println("perimeter is:"+perimeter);
}
}
