package basicPrograms;

import java.util.Scanner;

public class Circle {
	
	public static void main(String args[])
	{
	float r,area=0,circ=0;
	Scanner a = new Scanner (System.in);
	System.out.println("enter Radius:");
	r = a.nextFloat();
	area = 3.14f*r*r;
	circ = 2*3.14f*r;
	System.out.println("area is :"+area);
	System.out.println("circumference is :"+circ);
}

}
